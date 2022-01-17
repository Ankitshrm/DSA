import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int start=ip.nextInt();
        int end=ip.nextInt();

        for(int i=start;i<=end;i++)
        {
            int count=0;
            for(int j=2;j*j<=end;j++)
            {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
        ip.close();
        
    }
}
