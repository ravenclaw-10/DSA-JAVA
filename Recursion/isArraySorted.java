package Recursion;

import java.util.Scanner;

public class isArraySorted {
    public static boolean isArrSort(int[] arr,int s){
        if(s==arr.length-1)
            return true;
        if(arr[s]<arr[s+1])
            isArrSort(arr,s+1);      
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean res=isArrSort(arr,0);
        if(res)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}
