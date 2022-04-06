package BinaryTree;

import java.util.Scanner;

class Node1{
    int key;
    Node1 left,right;
    Node1(int k){
        k=key;
        left=right=null;
    }
}

public class BST {
    static Node1 root;

    public static void insert(Node1 root,int val){
        if(root==null){
            root=new Node1(val);
        }
        if(val<=root.key)
            root.left=new Node1(val);
        if(val>root.key)
            root.right=new Node1(val);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of root element:");
        int val=sc.nextInt();
        insert(root,val);
    }
}
