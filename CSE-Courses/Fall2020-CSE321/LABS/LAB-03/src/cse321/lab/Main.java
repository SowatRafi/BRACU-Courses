package cse321.lab;

public class Main {
    // main method represents main thread
    public static void main(String[] args) {
        // whatever we write in here will be executed by main thread
        // Threads always execute the job in a sequence
        // Execution Content

        // Job 01
        System.out.println("...Application started...");

        // Job 02
        MyTask task = new MyTask();
        //task.executeTask();
        task.start(); // -> Start shall internally run method

        // Till Job 02 is not finished, blow written jobs are waiting and are not executed
        // In case Job 02 is a long running operation, i.e. several documents are suppose to be printed
        // In such a use case OS/JVM shall give a message that app is not responding
        // Some sluggish behaviour in app can be observed -> App seems to hang

        // Now, main MyTask are executing parallely or concurrently !!

        // Job 03
        // Some code to print the documents
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println("Printing Document #"+ i + " - Printer:1");
        }

        // Job 04
        System.out.println("...Application Finished...");
    }
}
