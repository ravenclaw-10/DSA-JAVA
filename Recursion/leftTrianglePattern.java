package Recursion;

import java.util.Scanner;

public class leftTrianglePattern {
    public static void pattern(int n,int row,int col){
        if(row==n)
            return;
        if(col>row){
            System.out.println("");
            pattern(n,row+1,0);
            return;
        }
        System.out.print("* ");
        pattern(n,row,col+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of triangle");
        int n=sc.nextInt();
        pattern(n,0,0);
    }
    
}
