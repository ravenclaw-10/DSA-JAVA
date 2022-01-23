package Array;

import java.util.Scanner;

public class spiralPrint {
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
    public static void spiralPrintFunc(int[][] arr){
        int top,bottom,left,right,count,dir;
        top=0;
        bottom=arr.length-1;
        left=0;
        right=arr[top].length-1;
        dir=1;
        count=(bottom+1)*(right+1);
        
        while(left<=right && top<=bottom){
            if(count>0){
                if(dir==1){
                    for(int i=left;i<=right;i++){
                        System.out.print(arr[top][i]+",");
                        count--;
                    }
                    dir=2;
                    top++;
                }
            }
            if(count>0){
                if(dir==2){
                    for(int i=top;i<=bottom;i++){
                        System.out.print(arr[i][right]+",");
                        count--;
                    }
                    dir=3;
                    right--;
                }
            }
            if(count>0){
                if(dir==3){
                    for(int i=right;i>=left;i--){
                        System.out.print(arr[bottom][i]+",");
                        count--;
                    }
                    dir=4;
                    bottom--;
                }
            }
            if(count>0){
                if(dir==4){
                    for(int i=bottom;i>=top;i--){
                        System.out.print(arr[i][left]+",");
                        count--;
                    }
                    dir=1;
                    left++;
                }
            }
        }
        System.out.println("END");
    }
    public static void main(String args[]){
        int[][] arr;
        arr=takeInput();
        spiralPrintFunc(arr);
        
        
    }
}
