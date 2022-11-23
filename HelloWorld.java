package coding.didi;

import java.util.Scanner;

public class HelloWorld { // class
    static int a; // member variable
//    static int b;
    public static void main(String[] args) {
//        int x = 10;
//        HelloWorld h = new HelloWorld(); // class object, member variable gets memory
//        h.a = 10;
        a = Integer.valueOf(args[0]);
        System.out.println(a);
//        b = args[1];


        // cin, cout, scanf, printf

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a new number");
//        int p = sc.nextInt(); // cin
//        System.out.println("number is " + p);
////        String str = sc.nextLine();
////        float fl = sc.nextFloat();
//
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(i);
//        }
    }
}


// gcc helloworld.cpp --> a.out --> a.out
// javac hellowwold.java  --> helloworld.class   --> java helloworld.class 100 200

// compilation --> linking, loading, convert into executable (binary, which our processor instruction set can understand)
// running --> static memory allocation, program runs line by line, allocate dynamic memnory as per needed
