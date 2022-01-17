import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();
        int key=ip.nextInt();
        
        int sumofdig=0;
        int temp=n;
        while(temp-- >0){
            temp/=10;
            sumofdig++;
        }
        int mul =1;
        int div=1;
        key%=sumofdig;  // for greater numbers
        if(key<0){
            key=key+sumofdig;           // for Negative numbers
        }

        for(int i=1;i<=sumofdig;i++)
        {
            if(i<=key){
                div*=10;
            }else{
                mul*=10;
            }
        }

        int q=n/div;
        int r=n%div;

        int a=r*mul+q;
        System.out.println(a);


        ip.close();
    }

}
