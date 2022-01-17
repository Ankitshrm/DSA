import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
       for(int i=2;i*i<=n;i++)
       {
            while(n%i==0){
                n=n/i;
                System.out.print(i+" ");
            }
       }
       if(n!=0){
           System.out.println(n);
       }
    }
}
