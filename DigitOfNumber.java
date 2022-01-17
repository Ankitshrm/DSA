import java.util.Scanner;

public class DigitOfNumber {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int c=0;
        int temp=n;
        while(n!=0){
            
            n=n/10;
            c=c+1;
            
        }
        int d=(int)Math.pow(10, c);
        System.out.println(c+" "+n);
        ip.close();
    }
}
