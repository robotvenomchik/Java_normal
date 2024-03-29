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
        actionThread sum = new actionThread(()->System.out.println(this.sumOfEvenNumbers()+ " Sum"));
        actionThread mult = new actionThread(()->System.out.println(this.multiNumbers()+" Mult"));
        actionThread max = new actionThread(()->System.out.println(this.maxNumber() + " MAX"));
        actionThread oddnum = new actionThread(()->System.out.println(this.oddNumbers() + " ODD"));
        actionThread avarage = new actionThread(()->System.out.println(this.average() + " average"));

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
    interface Task{
        void doIt();
    }

    class actionThread extends Thread {
        private Task task;
        public actionThread (Task task) {
            this.task= task;
        }

        public void run() {
            task.doIt();
        }
    }

}
