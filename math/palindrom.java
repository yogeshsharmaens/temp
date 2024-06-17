public class palindrom {
    public static void main(String[] args) {
        int num= 5445;
        int temp = num;
        int rev = 0;
        boolean checkPalin = false;
        while (temp  > 0) {
            rev = rev*10 + temp%10;
            temp=temp/10;
        }
        if(num == rev){
            checkPalin = true;
        } else {
            checkPalin =false;
        }
        System.out.println(checkPalin);
    }
}
