package SearchingAndSorting;

import java.util.Scanner;

public class binarySearch {
    public static boolean bSearch(int[] arr, int  lo, int hi, int mid,int x){
        while(lo<=hi){
            if(x==arr[mid])
                return true;
            else if(x<arr[mid]){
                hi=mid-1;
                mid=(lo+hi)/2;
            }
            else{
                lo=mid+1;
                mid=(lo+hi)/2;
            }
        }
        return false;
    }

    public static boolean bSearchRec(int[] arr, int lo, int hi, int mid, int x){
        if (lo>hi)
            return false;
        if(x==arr[mid])
            return true;
        if(x<arr[mid]){
            if(bSearchRec(arr,lo,mid-1,(lo+hi)/2,x))
                return true;
        }
        if(x>arr[mid]){
            if(bSearchRec(arr,mid+1,hi,(lo+hi)/2,x))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be search:");
        int x=sc.nextInt();
        int hi=arr.length-1;
        if(bSearchRec(arr,0,hi,hi/2,x))
            System.out.println("Element is present");
        else
            System.out.println("Element is not present");

        if(bSearch(arr,0,hi,hi/2,x))
            System.out.println("Element is present");
        else
            System.out.println("Element is not present");
    }
}
