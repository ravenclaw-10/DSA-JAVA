package LinkedList;

public class DLL {
    public static Node head;
    public static Node tail;
    public static int size;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node (int d){
            data=d;
            next=head;
            prev=null;
        }
    }

    public static void insertAtFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(node.next!=null)
            node.next.prev=node;
        if(tail==null)
            tail=head;
        size++;
    }

    public static void insertAtLast(int val){
        Node node =new Node(val);
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        size++;

    }

    public static void delete(int idx){
        if(idx==1) {
            head=head.next;
            head.prev=null;
            return;
        }
        if(idx==size){
            tail=tail.prev;
            tail.next=null;
            return;

        }

        int count=1;
        Node temp=head;
        while(count!=idx){
            temp=temp.next;
            count++;
        }
        temp.prev.next=temp.next;
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        DLL.insertAtFirst(3);
        DLL.insertAtFirst(2);
        DLL.insertAtFirst(1);

        DLL.insertAtLast(4);
        DLL.insertAtLast(5);

        DLL.delete(1);

        DLL.display();
    }
}
