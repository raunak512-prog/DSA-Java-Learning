package JavaCore;

interface Bycycle{
    final int a = 55;
    void applyBrake(int decrement );
    void speedUp(int increment);
}
interface Hornbycycle{
    int a = 45;
    void blowhorn3g();
    void blowhorn4g();
}
class Avoncycle implements Bycycle{
    void blowhorn(){
        System.out.println("Pee pee poo poo");
    }
    public void applyBrake(int decrement ){
        System.out.println("Applying break");
    }
    public void speedUp(int increment){
        System.out.println("Applying accelerator");
    }
    public void blowhornk3g(){
        System.out.println("pee pee pee");
    }
    public void blowhorn4g(){
        System.out.println("Poo poo pooo");
    }
}
public class inetvsabs {
    public static void main(String[] args) {
        Avoncycle cycleraunak = new Avoncycle();
        //cycleraunak.applyBrake(2);
        // you can create properties in JavaCore.interfaces.
        System.out.println(cycleraunak.a);
        //You cannot modify the JavaCore.interfaces as they are final.
        //cycleraunak.a=454;
        //System.out.println(cycleraunak.a);

        cycleraunak.blowhornk3g();
        cycleraunak.blowhorn4g();
    }
}
