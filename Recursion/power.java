
package Recursion;

import java.util.Scanner;

public class power {
    public static int power(int num,int pow){
        if(pow==0)
            return 1;
        int pm1=power(num,pow-1);
        int res=num*pm1;
        return res;
    }
    public static void main(String[] args) {
        int n,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the power");
        int pow=sc.nextInt();
        res=power(num,pow);
        System.out.println(res);
    }
    
}
