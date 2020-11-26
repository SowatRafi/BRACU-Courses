public class Task_01_Tester {
    public static void main(String[] args) {
        Task_01 myThread1 = new Task_01();
        Task_01 myThread2 = new Task_01();

        myThread1.Step_One();
        //System.out.println(myThread1.getName());
//        try {
//            myThread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        myThread2.Step_Two();
        //System.out.println(myThread2.getName());


        myThread1.Step_Three();
        //System.out.println(myThread1.getName());
    }
}