public class Task_01 extends Thread {
//    public Task_01(String name){
//        super(name);
//    }

    public void Step_One() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This output is from " + getName() +" : " + i);
        }
    }
    public void Step_Two() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("This output is from " + getName() +" : " + i);
        }
    }

    public void Step_Three() {
        for (int i = 21; i <= 30; i++) {
            System.out.println("This output is from " + getName() +" : " + i);
        }
    }
}