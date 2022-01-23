package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n){
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        int fnm1=fibo(n-1);
        int fnm2=fibo(n-2);
        int res=fnm1+fnm2;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the limit of fibonacci series:");
        n=sc.nextInt();
        int res=fibo(n);
        System.out.println(res);
    }
    
}
