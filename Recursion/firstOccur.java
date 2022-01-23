package Recursion;

import java.util.Scanner;

public class firstOccur {
    public static int checkOccur(int[] arr, int ptr, int num){
        if(ptr==arr.length)
            return -1;
        if(num==arr[ptr])
            return ptr;
        int res=checkOccur(arr,ptr+1,num);
        return res;
    }
    
    //----------For last Occurence--------------//
    
    public static int lastOccur(int[] arr, int ptr, int num){
        if(ptr==arr.length)
            return -1; 
        int res=lastOccur(arr,ptr+1,num);
        if(num==arr[ptr] && res==-1)
            return ptr;        
        return res;
        
    }
    
    //----------------Print all occurence------------//
    
    public static void allOccur(int[] arr, int ptr,int num){
        if(ptr==arr.length)
            return;
        if(num==arr[ptr])
            System.out.print(ptr+" "); 
        allOccur(arr,ptr+1,num);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be search");
        int num=sc.nextInt();
        int res=checkOccur(arr,0,num);
        int res2=lastOccur(arr,0,num);
        System.out.print("First Occurence: ");
        System.out.println(res);
        System.out.print("Second Occurence: ");
        System.out.println(res2);
        System.out.print("All indices: ");
        allOccur(arr,0,num);
        System.out.println("");
    }
}
