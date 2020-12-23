import java.util.Scanner;

public class priority {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    int x, n, pr[], ppr[], bts[], ws[], tp[], awt, atat, i, cts[];

    pr = new int[10];
    ppr = new int[10];
    bts = new int[10];
    ws = new int[10];
    tp = new int[10];
    cts = new int[10];

    

    System.out.print("Enter the number of process : ");
    n = s.nextInt();
    System.out.print("\n\t Enter burst time : time priorities \n");

    for (i = 0; i < n; i++) {
      System.out.print("\nProcess[" + (i + 1) + "]:");
      bts[i] = s.nextInt();
      ppr[i] = s.nextInt();
      pr[i] = i + 1;
    }

   
    for (i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (ppr[i] > ppr[j]) {
          x = ppr[i];
          ppr[i] = ppr[j];
          ppr[j] = x;
          x = bts[i];
          bts[i] = bts[j];
          bts[j] = x;
          x = pr[i];
          pr[i] = pr[j];
          pr[j] = x;
        }
      }
    }
    ws[0] = 0;
    awt = 0;
    tp[0] = bts[0];
    atat = tp[0];
    for (i = 1; i < n; i++) {
      ws[i] = tp[i - 1];
      awt += ws[i];
      tp[i] = ws[i] + bts[i];
      cts[i] = tp[i];
      atat += tp[i];
    }



    System.out.print("\n\nProcess \t Burst Time \t Wait Time \t Turn Around Time   Priority \n");
    for (i = 0; i < n; i++)
      System.out.print(
          "\n   " + pr[i] + "\t\t   " + bts[i] + "\t\t     " + ws[i] + "\t\t     " + tp[i] + "\t\t     " + ppr[i] + "\n");
    awt /= n;
    atat /= n;
    System.out.print("\n Average Wait Time : " + awt);
    System.out.print("\n Average Turn Around Time : " + atat);

  }
}