package JavaCore;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread not a threat:");
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread 2 not a thread:");
    }
}
public class threadrunn {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
