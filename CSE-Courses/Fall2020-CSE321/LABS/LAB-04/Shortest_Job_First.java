import java.util.Scanner;

class Process {
        int pid; 
        int b_t;
        int art;

        public Process(int pid, int b_t, int art) {
                this.pid = pid;
                this.b_t = b_t;
                this.art = art;
        }
}

public class Shortest_Job_First {
        
        static void findWaitingTime(Process proc[], int n, int wt[]) {
                int rt[] = new int[n];

               
                for (int i = 0; i < n; i++)
                        rt[i] = proc[i].b_t;

                int complete = 0, t = 0, minm = Integer.MAX_VALUE;
                int shortest = 0, finish_time;
                boolean check = false;

                
                while (complete != n) {

                        
                        for (int j = 0; j < n; j++) {
                                if ((proc[j].art <= t) && (rt[j] < minm) && rt[j] > 0) {
                                        minm = rt[j];
                                        shortest = j;
                                        check = true;
                                }
                        }

                        if (check == false) {
                                t++;
                                continue;
                        }

                        
                        rt[shortest]--;

                      
                        minm = rt[shortest];
                        if (minm == 0)
                                minm = Integer.MAX_VALUE;

                        
                       
                        if (rt[shortest] == 0) {

                                complete++;
                                check = false;

                                
                                finish_time = t + 1;

                                
                                wt[shortest] = finish_time - proc[shortest].b_t - proc[shortest].art;

                                if (wt[shortest] < 0)
                                        wt[shortest] = 0;
                        }
                        
                        t++;
                }
        }

       
        static void findTurnAroundTime(Process proc[], int n, int wt[], int tat[]) {
                for (int i = 0; i < n; i++)
                        tat[i] = proc[i].b_t + wt[i];
        }

        static void findCompletionTime(Process proc[], int n, int ct[], int tat[]) {
               
                for (int i = 0; i < n; i++) {
                        ct[i] = proc[i].art + tat[i];
                }
        }

      
        static void findavgTime(Process proc[], int n) {
                int wt[] = new int[n], tat[] = new int[n], ct[] = new int[n];
                ;
                int total_wt = 0, total_tat = 0;

                
                findWaitingTime(proc, n, wt);

                
                findTurnAroundTime(proc, n, wt, tat);

                findCompletionTime(proc, n, ct, tat);

               
                System.out.println("Processes\t" + " Burst time\t" + " Arrival time\t" + " Completion time\t"
                                + " Waiting time\t" + " Turn around time");

               
                for (int i = 0; i < n; i++) {
                        total_wt = total_wt + wt[i];
                        total_tat = total_tat + tat[i];
                        System.out.println(" " + proc[i].pid + "\t\t" + proc[i].b_t + "\t\t " + proc[i].art + "\t\t " + ct[i]
                                        + "\t\t\t " + wt[i] + "\t\t" + tat[i]);
                }

                System.out.println("Average waiting time = " + (float) total_wt / (float) n);
                System.out.println("Average turn around time = " + (float) total_tat / (float) n);
        }

      
        public static void main(String[] args) {
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter the number of process = ");
                int n = obj.nextInt();

                Process p[] = { new Process(1, 8, 0), new Process(2, 4, 1), new Process(3, 9, 2), new Process(4, 5, 3) };

                findavgTime(p, n);
        }
}
