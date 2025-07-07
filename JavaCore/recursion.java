package JavaCore;

public class recursion {
    // factorial(n) = n*factorial(n-1)

    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n *factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int prod = 1;
            for (int i = 1; i<=n;i++){
                prod *= i;
            }
            return prod;

        }
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(factorial(n));
        System.out.println("The value of factorial n using iteration is " + factorial_iterative(n));
    }
}
