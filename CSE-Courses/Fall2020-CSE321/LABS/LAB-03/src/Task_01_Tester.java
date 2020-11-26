public class Task_01_Tester {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("task-01");
        MyThread myThread2 = new MyThread("task-02");

        myThread1.start();
        myThread2.start();
    }
}