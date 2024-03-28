import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Homework19 {
    private final List<Integer> numbers;

    public Homework19() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int sumOfEvenNumbers() {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<Integer> multiNumbers() {
        return numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
    }

    public int maxNumber() {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
    }

    public String oddNumbers() {
        return numbers.stream()
                .filter(num -> num % 2 != 0)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public double average() {
        return numbers.stream()
                .mapToDouble(Integer::intValue)
                .average()
                .orElse(0);
    }

    public void seeAllActions() {
        SumThread sum = new SumThread(this);
        MultNumbers mult = new MultNumbers(this);
        MaxThread max = new MaxThread(this);
        OddNumbersThread oddnum = new OddNumbersThread(this);
        AvarageThread avarage = new AvarageThread(this);

        avarage.start();
        sum.start();
        mult.start();
        max.start();
        oddnum.start();
    }

    public static void main(String[] args) {
        Homework19 pepa = new Homework19();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть цілі числа (для завершення введіть 'done'): ");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            pepa.addNumber(number);
        }
        scanner.close();

        pepa.seeAllActions();
    }

    static class SumThread extends Thread {
        private final Homework19 pe;

        public SumThread(Homework19 pe) {
            this.pe = pe;
        }

        public void run() {
            System.out.println(pe.sumOfEvenNumbers()+ " Sum" );
        }
    }

    static class MultNumbers extends Thread {
        private final Homework19 pe;

        public MultNumbers(Homework19 pe) {
            this.pe = pe;
        }

        public void run() {
            System.out.println(pe.multiNumbers()+" Mult");
        }
    }

    static class MaxThread extends Thread {
        private final Homework19 pe;

        public MaxThread(Homework19 pe) {
            this.pe = pe;
        }

        public void run() {
            System.out.println(pe.maxNumber() + " MAX");

        }
    }

    static class OddNumbersThread extends Thread {
        private final Homework19 pe;

        public OddNumbersThread(Homework19 pe) {
            this.pe = pe;
        }

        public void run() {
            System.out.println(pe.oddNumbers()+ " Odd");
        }
    }

    static class AvarageThread extends Thread {
        private final Homework19 pe;

        public AvarageThread(Homework19 pe) {
            this.pe = pe;
        }

        public void run() {
            System.out.println(pe.average()+" Avarage");

        }
    }
}
