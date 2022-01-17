import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int a=ip.nextInt();
        int b=ip.nextInt();
        int oa=a;
        int ob=b;
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }

        int gcd=b;
        
        int lcm=(oa*ob)/gcd;
        System.out.println(gcd+" "+lcm);
        ip.close();

    }
}
