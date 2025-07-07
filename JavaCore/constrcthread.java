package JavaCore;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i =34;
        System.out.println("Thank you");
        while (true){
            System.out.println("I am a thread.");
        }
    }
}
public class constrcthread {
    public static void main(String[] args) {

        MyThr th = new MyThr("Raunak");
        th.start();
        System.out.println("The id of the thread is" + th.getId());

    }
}
