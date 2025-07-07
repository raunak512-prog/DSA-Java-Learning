package JavaCore;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on JavaCore.Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on JavaCore.SmartPhone...");
    }
}
public class dyndispatch {
    public static void main(String[] args) {
        // JavaCore.Phone obj = new JavaCore.Phone(); // Allowed
        // JavaCore.SmartPhone smobj = new JavaCore.SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
        // JavaCore.SmartPhone obj2 = new JavaCore.Phone(); // Not allowed

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed


    }
}
