package Task2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the maximum number (n):");
        int n =sc.nextInt();
        int first=0;
        int second=1;
        System.out.println("Fibonacci series up to " + n +":");
        while(first <= n){
            System.out.print(first +" ");
            int next= first+second;
            first=second;
            second=next;
        }

    }

}


