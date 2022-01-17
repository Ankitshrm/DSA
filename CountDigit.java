import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        while(n-- >0){
            int num=ip.nextInt();
            int sum=0;
            while(num-- >0){
                num=num/10;
                sum++;
            }
            System.out.println(sum);
        }
        ip.close();
    }
}
