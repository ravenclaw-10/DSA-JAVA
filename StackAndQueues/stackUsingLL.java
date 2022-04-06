package StackAndQueues;

public class stackUsingLL {
    public static int top=-1;
    public static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=head;
        }
    }
    public static boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    public static void push(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        top++;
    }
    public static void pop(){
        if(isEmpty())
            return;
        head=head.next;
        top--;
    }
    public static int peek(){

        return head.data;
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        stackUsingLL.push(1);
        stackUsingLL.push(2);
        stackUsingLL.push(3);

        stackUsingLL.display();
        System.out.println(stackUsingLL.peek());

        stackUsingLL.pop();
        stackUsingLL.display();
    }
}
