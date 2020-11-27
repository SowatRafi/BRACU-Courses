class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++){
            if ( i==10 ) {
                System.out.println("This output is from " + Thread.currentThread().getName() +" : " + i);
                break;
            }
            System.out.println("This output is from " + Thread.currentThread().getName() +" : 0" + i);
        }
        MyThread2 thread2 = new MyThread2();
        thread2.start();
        try {
            thread2.join();
        }  catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 21 ; i <= 30 ; i++){
            System.out.println("This output is from " + Thread.currentThread().getName() +" : " + i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 11 ; i <= 20 ; i++){
            System.out.println("This output is from " + Thread.currentThread().getName() +" : " + i);
        }
    }
}

public class Task_01 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        myThread.start();
    }
}
