package LinkedList;

//import java.util.LinkedList;
import java.util.Scanner;

public class LL {
    public static Node head;
    public static Node tail;
    public static int size;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public static void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        LL.head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public static void insertAtLast(int val){
        if(tail==null){
            insertAtFirst( val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public static void delete(int idx){
        if(idx==1){
            head=head.next;
            return;
        }
        if(idx==size){
            Node t=head;
            int counter=1;
            while(counter!=size-1){
                t=t.next;
                counter++;
            }
            t.next=null;
            return;
        }
        Node temp=head;
        int count=1;
        while(count!=idx-1){
            temp=temp.next;
            count++;
        }
        temp.next =temp.next.next;

    }

    public static void display(){
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("END");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //LinkedList<Integer> Llist= new LinkedList<>();
        LL.insertAtFirst(5);
        LL.insertAtFirst(4);
        LL.insertAtFirst(3);
        LL.insertAtFirst(2);
        LL.insertAtFirst(1);
        //System.out.println("Enter First element:");
        //int f=sc.nextInt();
        //System.out.println("Enter last elem:");
        //int l=sc.nextInt();
        //LL.insertAtFirst(f);
        //LL.insertAtLast(l);
        LL.display();
        LL.delete(1);
        LL.display();
    }

}

