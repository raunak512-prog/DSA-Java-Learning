package JavaCore;

class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id = 0;
        name = "Your name here...";
    }
    public MyMainEmployee(String myName, int myId ){
        id  = myId;
        name  = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee raunak = new MyMainEmployee("ProgrammingWithraunak", 12);
        //JavaCore.MyMainEmployee raunak  = new JavaCore.MyMainEmployee();
        raunak.setName("CodeWithRaunak");
        raunak.setId(34);
        System.out.println(raunak.getId());
        System.out.println(raunak.getName());
    }
}
