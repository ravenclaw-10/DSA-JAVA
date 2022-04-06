package SearchingAndSorting;

import java.util.Scanner;

public class linearSearch {
    public static void lSearch(int[] arr,int num) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = 1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("Found");
        }
        if(flag==0){
            System.out.println("Not Found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elem");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int num=sc.nextInt();
        lSearch(arr,num);
    }
}
