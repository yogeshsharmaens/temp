
public class digitSum {
    public static void main(String[] args) {
        int num = 4567;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
