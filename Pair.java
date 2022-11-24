package coding.didi;
import java.util.*;

public class Pair {
    public static void main(String[] str)
    {
        int n;
        System.out.println("ENTER NO  ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER SORTED ARRAY   ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x;
//        int sum=0;
        //int flag=0;
        System.out.println("ENTER Window size   ");
        x=sc.nextInt();
//        for(int i=0;i<x;i++)
//        {
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);
//        int i=1;
//        while(i<=(n-x))
//        {
//            sum=sum-arr[i-1]+arr[i+x-1];
//            System.out.println(sum);
//            i++;
//        }


        int sum = 0;
        int i;
        for(i = 0; i < x-1; i++) {
            sum += arr[i];
        }

        while(i < n) {
            sum += arr[i];
            System.out.println(sum);
            sum -= arr[i-x+1];
            i++;
        }


    }
}
