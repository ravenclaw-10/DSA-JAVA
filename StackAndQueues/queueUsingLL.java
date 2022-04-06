package StackAndQueues;

public class queueUsingLL {
    //public static int bottom=-1;
    public static Node head;
    public static int len=5;
    public static int size=0;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=head;
        }
    }

    public static void enqueue(int val){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        Node node=new Node(val);
        node.next=head;
        head=node;
        size++;
    }

    public static void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp=get(size-1);
        temp.next=null;
        size--;
    }

    public static Node get(int idx){
        Node temp=head;
        int count=1;
        while(count<idx){
            temp=temp.next;
            count++;
        }
        return temp;
    }

    public static boolean isFull(){
        if(size==len)
            return true;
        return false;
    }

    public static boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        queueUsingLL.enqueue(1);
        queueUsingLL.enqueue(2);
        queueUsingLL.enqueue(3);

        queueUsingLL.display();

        queueUsingLL.dequeue();
        queueUsingLL.display();


    }
}
