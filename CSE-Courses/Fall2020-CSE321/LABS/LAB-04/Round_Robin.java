import java.util.Scanner;

public class Round_Robin {
    
    static void findWaitingTime(int processes[], int n, int bt[], int wt[], int quantum) {
        
        int r_b[] = new int[n];
        for (int i = 0; i < n; i++)
            r_b[i] = bt[i];

        int ts = 0;

        
        while (true) {
            boolean d = true;

           
            for (int i = 0; i < n; i++) {
               
                if (r_b[i] > 0) {
                    d = false;

                    if (r_b[i] > quantum) {
                       
                        ts += quantum;

                       
                        r_b[i] -= quantum;
                    }

                    else {
                       
                        ts = ts + r_b[i];

                       
                        wt[i] = ts - bt[i];

                   
                        r_b[i] = 0;
                    }
                }
            }

            
            if (d == true)
                break;
        }
    }

   
    static void findTurnAroundTime(int p[], int n, int bt[], int wt[], int tat[]) {
        
        for (int i = 0; i < n; i++)
            tat[i] = bt[i] + wt[i];
    }

   
    static void findavgTime(int p[], int n, int bt[], int quantum) {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

       
        findWaitingTime(p, n, bt, wt, quantum);

       
        findTurnAroundTime(p, n, bt, wt, tat);

       
        System.out.println("Processes " + " Burst time " + " Waiting time " + " Turn around time");

       
        for (int i = 0; i < n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.println(" " + (i + 1) + "\t\t" + bt[i] + "\t " + wt[i] + "\t\t " + tat[i]);
        }

        System.out.println("Average waiting time = " + (float) total_wt / (float) n);
        System.out.println("Average turn around time = " + (float) total_tat / (float) n);
    }

  
    public static void main(String[] args) {
       
        int p[] = { 1, 2, 3 };
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number, if process: ");
        int n = s.nextInt();

      
        int b_t[] = { 24, 3, 3 };

       
        int quan = 4;
        findavgTime(p, n, b_t, quan);
    }
}