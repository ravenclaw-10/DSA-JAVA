package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class printPermutation {

    public static ArrayList<String> printP(String s,int idx){
        if(idx==s.length()){
            ArrayList<String> res=new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> result=printP(s,idx);
        printP(s,idx+1);
        if(idx==0) {
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        printP(s,0);
    }

}
