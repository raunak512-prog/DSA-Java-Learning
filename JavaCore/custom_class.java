package JavaCore;

class employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is " + id);
        System.out.println("And my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }

}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class: ");
        employee raunak = new employee();// Instantiating new JavaCore.employee object.
        employee john = new employee();
        // Setting attributes.
        raunak.id =13;
        raunak.name = "Raunak.";
        raunak.salary = 100;
        john.id = 15;
        john.name = "john tripathi";
        john.salary = 50;

        //Printing the attributes.
       // System.out.println(raunak.id);
      //  System.out.println(raunak.name);
        raunak.printdetails();
        john.printdetails();
        int salary = john.getSalary();
        System.out.println(salary);

    }
}
