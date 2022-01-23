package Recursion;

import java.util.Scanner;

public class bubbleSort {
    public static void sort(int[] arr, int i, int j){
        if(i==arr.length)
            return;
        if(j==arr.length-1){
            sort(arr,i+1,0);
            return;
        }
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;            
        }        
        sort(arr,i,j+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,0,0);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    
}
