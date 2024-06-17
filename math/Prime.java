import java.util.Scanner;

class CheckPrime{
    public boolean isPrime(int num){
        boolean res= true;
        for(int i=2 ; i< num/2; i++){
            if(num%i == 0 ){
                return false;
            }
        }
        return res;
    } 
}
public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        CheckPrime cp = new CheckPrime();
        boolean res = cp.isPrime(num);
        System.out.println(res);
    }
}
