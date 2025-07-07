package JavaCore;

class MyEmployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class gettersetter {
    public static void main(String[] args) {
        MyEmployee raunak  = new MyEmployee();
        raunak.setName("Raunak is a good boy");
        System.out.println(raunak.getName());
        raunak.setId(35000);
        System.out.println(raunak.getId());
    }
}