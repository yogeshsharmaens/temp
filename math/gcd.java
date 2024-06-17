public class gcd {
    public static void gcd(int n1, int n2){
        if(n2>n1){
            n2=n2-n1;
        } else {
            n1=n1-n2;
        } 
    }
    public static void main(String[] args) {
        int n1=5;
        int n2=7;
        
        while (n1!=0 && n2!=0){
            gcd(n1, n2);
        }
        // int gcd = 0;
        // int num = n2 > n1? n1 : n2 ;
        // for(int i = 1; i< num ; i++ ){
        //     if(n1%i == 0 && n2%i == 0){
        //         gcd=i;
        //     }
        // }
        // System.out.println(gcd);
    }
    
}
