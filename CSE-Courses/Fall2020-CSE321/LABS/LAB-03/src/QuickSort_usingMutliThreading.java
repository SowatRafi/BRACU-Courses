import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class QuickSort_usingMutliThreading extends RecursiveTask<Integer> {

    int start_index, end_index;
    int[] arr;

    private int partion(int start_index, int end_index_index, int[] arr) {

        int i = start_index, j = end_index_index;
        int pivote = new Random().nextInt(j - i)+ i;
        // Swap the pivot with end_index element of array;
        int t = arr[j];
        arr[j] = arr[pivote];
        arr[pivote] = t;
        j--;

        // start_index partioning
        while (i <= j) {

            if (arr[i] <= arr[end_index]) {
                i++;
                continue;
            }

            if (arr[j] >= arr[end_index]) {
                j--;
                continue;
            }

            t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
            j--;
            i++;
        }
        // Swap pivot to its correct position
        t = arr[j + 1];
        arr[j + 1] = arr[end_index];
        arr[end_index] = t;
        return j + 1;
    }

    // Function to implement QuickSort method
    public QuickSort_usingMutliThreading (int start_index, int end_index, int[] arr) {
        this.arr = arr;
        this.start_index = start_index;
        this.end_index = end_index;
    }

    @Override
    protected Integer compute() {
        // Base case
        if (start_index >= end_index)
            return null;

        // Find partion
        int p = partion(start_index, end_index, arr);

        // Divide array
        QuickSort_usingMutliThreading left
                = new QuickSort_usingMutliThreading (start_index, p - 1, arr);

        QuickSort_usingMutliThreading right
                = new QuickSort_usingMutliThreading (p + 1, end_index, arr);
        left.fork();
        right.compute();
        left.join();
        return null;
    }

    // Driver Code for the program
    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        // Getting user input
        System.out.print("How many integers ? ");
        int n = input.nextInt();
        int[] arr = new int[n];
        // Inserting the elements in the array
        System.out.print("Enter the integers of the array : ");
        for (int i=0;i<n;i++) {
            int number = input.nextInt();
            arr[i]=number;
        }
        System.out.println("\nArray elements before sorting\n************************************");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        // Fork join ThreadPool to keep thread creation as per resources
        ForkJoinPool pool = ForkJoinPool.commonPool();
        // start_index the first thread in fork join pool for range 0, n-1
        pool.invoke( new QuickSort_usingMutliThreading ( 0, n - 1, arr));
        // Printing the sorted array
        System.out.println("\n\n\nArray elements after sorting in ascending order \n*******************************************");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}