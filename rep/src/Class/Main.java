package Class;

public class Main {
    public static void main(String[] args) {
        new UI();
//        Main main = new Main();

//        Task task = main.new Task();
//
//        task.start();



    }

    public void hardTask(){
        Task task = new Task();
        task.start();
    }


    class Task extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }
    }
}