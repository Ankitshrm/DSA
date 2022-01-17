import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
       
        while(n!=0){
            int rem=n%10;
            n=n/10;
            System.out.print(rem);
        } 
        ip.close();
    }
}
