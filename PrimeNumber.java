import java.util.Scanner;

public class PrimeNumber{

    //Time Limit Exceeded
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();
        
        while(n-- >0){
            int c=0;
            int num =ip.nextInt();
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    c=c+1;
                }
            }
            if(c==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        ip.close();
    }
}