import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
        ip.close();
    }
}
