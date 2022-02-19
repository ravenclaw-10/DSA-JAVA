package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class getMazePath {
    public static ArrayList<String> getPaths(int currRow,int currCol, int rows,int cols){
        if(currRow==rows && currCol==cols){
            ArrayList<String> br=new ArrayList<>();
            br.add(" ");
            return br;
        }
        if(currRow>rows || currCol>cols){
            ArrayList<String> br=new ArrayList<>();
            return br;

        }
        ArrayList<String> res=new ArrayList<>();
        ArrayList<String> horMove=getPaths(currRow+1,currCol,rows,cols);
        for(String sh : horMove){
            res.add("H"+sh);
        }
        ArrayList<String> verMove=getPaths(currRow,currCol+1,rows,cols);
        for(String sv: verMove){
            res.add("V"+sv);
        }
        ArrayList<String> diagMove=getPaths(currRow+1,currCol+1,rows,cols);
        for(String sd: diagMove){
            res.add("D"+sd);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int row=sc.nextInt();
        System.out.println("Enter the columns:");
        int col=sc.nextInt();
        ArrayList<String> res=getPaths(0,0,row-1,col-1);
        System.out.println(res);
    }
}
