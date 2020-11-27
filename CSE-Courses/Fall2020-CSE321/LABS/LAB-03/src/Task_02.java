class Thread1 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 2;  count  <= 10000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 1 and 10000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " + numwithmax);

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
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 10001;  count  <= 20000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 10001 and 20000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}
class Thread3 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 20001;  count  <= 30000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 20001 and 30000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}class Thread4 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 30001;  count  <= 40000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 30001 and 40000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}class Thread5 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 40001;  count  <= 50000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 40001 and 50000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}class Thread6 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 50001;  count  <= 60000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 50001 and 60000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}class Thread7 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 60001;  count  <= 70000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 60001 and 70000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}class Thread8 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 70001;  count  <= 80000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 70001 and 80000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}class Thread9 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 80001;  count  <= 90000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 80001 and 90000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}class Thread10 extends Thread {
    @Override
    public void run() {
        int maxDivisors = 1;
        int numwithmax = 1;
        for ( int count = 90001;  count  <= 100000;  count ++ ) {
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

        System.out.println(Thread.currentThread().getName() +" to find the integer range 90001 and 100000");
        System.out.println("The maximum number of divisors are " + maxDivisors);
        System.out.println("A number with " + maxDivisors + " divisors is " +
                numwithmax);
    }
}

public class Task_02 {
    public static void main(String[] args) {
        Thread1 myThread = new Thread1();
        myThread.start();
    }
}
