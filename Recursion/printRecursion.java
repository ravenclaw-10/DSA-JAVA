package Recursion;

import java.util.Scanner;

public class printRecursion {
    public static void print(int n){
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        print(n);
    }
    
}
