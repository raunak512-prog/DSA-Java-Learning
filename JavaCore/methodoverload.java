package JavaCore;

public class methodoverload {

    static void foo(){
        System.out.println("Good morning broo!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " broo!");
    }
    static void change(int [] arr){
        arr[0]=98;
    }
    public static void main(String[] args) {
      //int[] marks = {52,65,76,78,89};
      //change(marks);
        //System.out.println("The value of x after running change is: " + marks[0]);
        foo();
        foo(5000);
    }

}
