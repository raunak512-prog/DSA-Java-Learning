package JavaCore;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 34;
        while (true){
            System.out.println("thankyou" + this.getName());
        }
    }
}
public class threadpriorty {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Jaiswal1");
        MyThr1 t2 = new MyThr1("Jasiwal2");
        MyThr1 t3 = new MyThr1("Jasiwal3");
        MyThr1 t4 = new MyThr1("Jasiwal4");
        MyThr1 t5 = new MyThr1("Jasiwal5(most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
