//Get all subsequence of a string 
//order is maintained in subsequence
//Using ArrayList
package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {
    public static ArrayList<String> getSS(String str,int ptr){
        if(ptr==str.length()){
            ArrayList<String> ret=new ArrayList<>();
            ret.add(" ");
            return ret;
        }
        char ch=str.charAt(ptr);
        ArrayList<String> resStr=getSS(str,ptr+1);
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<resStr.size();i++){
            res.add(resStr.get(i));
            res.add(ch+resStr.get(i));
        }
        return res;
        
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        ArrayList<String> res=getSS(str,0);
        System.out.println(res);
    }
    
}
