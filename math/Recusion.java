import java.util.Scanner;


public class Recusion {
    public static int print(int n) {
        if(n == 0) {
            return ;
        } // base case 

        
        System.out.println(n); // kaam
        return n;
    }

    public
    public static void main(String[] args) {
        int n  = 5;

        print(print(n-1));
    }
}
