package Array;

import java.util.Scanner;

public class wavePrint {
    public static int[][] takeInput(){
        Scanner sc=new Scanner(System.in);
        int rows,cols;
        System.out.println("Enter rows");
        rows=sc.nextInt();
        System.out.println("Enter columns");
        cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void wavePrint(int[][] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[i].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println("END");
    }
    public static void main(String args[]){
        int[][] arr;
        //arr={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        arr=takeInput(); 
        //display(arr);
        wavePrint(arr);
    }
}
