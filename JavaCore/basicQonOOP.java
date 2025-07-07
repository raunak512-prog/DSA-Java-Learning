package JavaCore;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){

        name = n;
    }
}

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callingFriend(){
        System.out.println("Calling Balchand...");
    }
}

class Square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length,breadth;
    int area(){
        return length * breadth;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }

}

public class basicQonOOP {
    public static void main(String[] args) {
        /* Problem 1.
     JavaCore.Employee raunak = new JavaCore.Employee();
     raunak.setName("Raunak is a good boy");
     raunak.salary=50000;
        System.out.println(raunak.getSalary());
        System.out.println(raunak.getName());
       */
     //Problem 2.
       /* JavaCore.cellphone asus = new JavaCore.cellphone();
        asus.callingFriend();
        asus.vibrate();
        asus.ring();

        */

        //Problem 3.
        /*JavaCore.Square sq = new JavaCore.Square();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

         */

        Tommy vecetti = new Tommy();
        vecetti.fire();
        vecetti.hit();
        vecetti.run();
    }
}
