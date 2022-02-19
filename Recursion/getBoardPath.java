package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class getBoardPath {
    public static ArrayList<String> getPath(int n,int dest){
        if(n==dest) {
            ArrayList<String> br = new ArrayList<>();
            br.add(" ");
            return br;
        }
        if(n>dest){
            ArrayList<String> br=new ArrayList<>();
            return br;
        }
        ArrayList<String> res=new ArrayList<>();
        for(int dice=1;dice<=6;dice++){
            ArrayList<String> rr=getPath(n+dice,dest);
            for(String s: rr){
                res.add(dice+s);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Destination(Number):");
        int dest=sc.nextInt();
        ArrayList<String> res=getPath(0,dest);
        System.out.println(res);
    }
}
