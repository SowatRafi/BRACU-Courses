class Algorithm {
    public void ALGORITHM(int start, int end) {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = start;  count  <= end;  count ++ ) {
            int divisorCount = 0;
            for ( int count2 = 1;  count2 <= count;  count2++ ) {
                if ( count % count2 == 0 )
                    divisorCount++;
            }

            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                numwithmax = count;
            }

        }

        System.out.println(Thread.currentThread().getName() +" to find the integer range "+ start +" and "+ end);
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " + numwithmax);
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(1, 10000);

        Thread2 thread2 = new Thread2();
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread3 thread3 = new Thread3();
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread4 thread4 = new Thread4();
        thread4.start();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread5 thread5 = new Thread5();
        thread5.start();
        try {
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread6 thread6 = new Thread6();
        thread6.start();
        try {
            thread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread7 thread7 = new Thread7();
        thread7.start();
        try {
            thread7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread8 thread8 = new Thread8();
        thread8.start();
        try {
            thread8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread9 thread9 = new Thread9();
        thread9.start();
        try {
            thread9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread10 thread10 = new Thread10();
        thread10.start();
        try {
            thread10.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}class Thread2 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(10001, 20000);
    }
}
class Thread3 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(20001, 30000);
    }
}class Thread4 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(30001, 40000);
    }
}class Thread5 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(40001, 50000);
    }
}class Thread6 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(50001, 60000);
    }
}class Thread7 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(60001, 70000);
    }
}class Thread8 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(70001, 80000);
    }
}class Thread9 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(80001, 90000);
    }
}class Thread10 extends Thread {
    @Override
    public void run() {
        Algorithm algo = new Algorithm();
        algo.ALGORITHM(90001, 100000);
    }
}

public class Task_02 {
    public static void main(String[] args) {
        Thread1 myThread = new Thread1();
        myThread.start();
    }
}
