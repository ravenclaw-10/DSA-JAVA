package StackAndQueues;

public class circularQueue {
    public static int front=0;
    public static int end=0;
    public static int size=0;
    public static int len=5;
    public static int[] CQ=new int[len];

    public static boolean isEmpty(){
        if(front==end)
            return true;
        return false;
    }

    public static boolean isFull(){
        if(end-front==len)
            return true;
        return false;
    }

    public static void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        CQ[end]=val;
        //System.out.println("Enqueued");
        end++;
        end=end%len;
        size++;
    }

    public static void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        front++;
        front=front%len;
        //System.out.println("Dequeued");
        size--;
    }

    public static void display(){
        for(int i=front;i<end;i++){
            System.out.print(CQ[i%5]+"->");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);

        circularQueue.display();
        circularQueue.enqueue(6);
        circularQueue.display();

    }
}
