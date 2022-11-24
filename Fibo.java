package coding.didi.recursion;
import java.util.*;

public class Fibo {
    static int fibonacci(int n ){

       if((n==1)||(n==2))
       {
           return 1;
       }
       else
           return fibonacci(n-1)+fibonacci(n-2);

    }
    public static void main(String[] args) {
        int n;

        System.out.println("ENTER THE NUMBER  ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(fibonacci(i));
        }


    }
}
