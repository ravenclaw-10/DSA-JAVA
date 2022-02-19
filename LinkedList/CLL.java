package LinkedList;

public class CLL {
    public static Node head;
    public static Node tail;
    public static int size;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=head;
        }
    }
    public static void insertAtFirst(int val){
        Node node =new Node(val);
        if(head==null){
            head=node;
            tail=head;
            tail.next=head;
            return;
        }
        node.next=head;
        head=node;
        size++;
    }

    public static void insert(int val , int afterVal){
        if(afterVal==tail.data){
            insertAtFirst(val);
        }
        Node node=new Node(val);
        Node temp=head;
        while(temp.data!=afterVal){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;

    }

    public static void delete(int val){
        if(val==head.data){
            head=head.next;
            tail.next=head;
            size--;
            return;
        }
        if(val==tail.data){
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
            size--;
            return;
        }
        Node temp=head;
        while(temp.next.data!=val){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }

    public static void display(){
        Node temp=head;
        while(temp!=tail){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.data+" -> ");
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        CLL.insertAtFirst(5);
        CLL.insertAtFirst(4);
        CLL.insertAtFirst(3);
        CLL.insertAtFirst(2);
        CLL.insertAtFirst(1);

        CLL.display();
        CLL.insert(35,3);
        CLL.display();
        CLL.delete(35);
        CLL.display();
    }
}
