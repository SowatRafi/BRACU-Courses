class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        //System.out.println("Hello world.");
        //System.out.println(Thread.currentThread().getName());
        yield();
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("This output is from " + getName() +" : " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}*/
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("Rafi-01");
        MyThread myThread2 = new MyThread("Rafi-02");
        MyThread myThread3 = new MyThread("Rafi-03");
        MyThread myThread4 = new MyThread("Rafi-04");

        //Thread myThreadRunnable = new Thread(new MyThreadRunnable(), "Rafi-02");

        /**
         * Thread(Object).run() will run the main thread
         * Thread(Object).run() will create a new thread
         * **/

        //myThreadRunnable.start();
        //myThread.run();

        //System.out.println("Hello World.");
        //System.out.println(Thread.currentThread().getName());

        //myThread3.setPriority(Thread.MAX_PRIORITY);
        //myThread1.setPriority(Thread.MIN_PRIORITY);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        System.out.println(myThread1.getState());

        // This join method hold the main thread and makes executable after these threads
        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
            myThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (!myThread2.isAlive()) {
            System.out.println(myThread2.getName() + " is DEAD !!!");
        }

        System.out.println("All threads are done!!!");
    }
}
