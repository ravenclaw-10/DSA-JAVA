package Recursion;

import java.util.Scanner;

public class printSubsequence {
    public static void printSeq(String s,int idx){
        if(idx==-1){
            System.out.print(" ");
            return;
        }
        //char ch=s.charAt(idx);
        String str=s.substring(idx);
        printSeq(s,idx-1);
        System.out.print(","+str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        printSeq(s,s.length()-1);
    }
}
