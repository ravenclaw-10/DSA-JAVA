package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class getAllPermutation {
    public static ArrayList<String> getPermutation(String s){
        if(s.length()==0){
            ArrayList<String> r=new ArrayList<>();
            r.add(" ");
            return r;
        }
        char ch=s.charAt(0);
        ArrayList<String> recStr= new ArrayList<>();
        ArrayList<String> res= new ArrayList<>();
        recStr=getPermutation(s.substring(1));
        for(String rs:recStr){
            for(int i=0;i<rs.length();i++){
                String sr=rs.substring(0,i)+ch+rs.substring(i);
                res.add(sr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> li=new ArrayList<>();
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        ArrayList<String> res=getPermutation(s);
        for(String rss: res){
            System.out.print(rss);
        }
    }
}
