package StackAndQueues;

public class queueUsingArray {
    public static int bottom=-1;
    public static int len=5;
    public static int[] queue=new int[len];

    public static void enqueue(int val){
        if(bottom>=len){
            System.out.println("Queue is full");
            return;
        }
        bottom++;
        queue[bottom]=val;
        System.out.println("Enqueued");
    }

    public static void dequeue(){
        if(bottom==-1){
            System.out.println("Queue is empty");
            return;
        }
        int removed=0;
        for(int i=1;i<len;i++){
            queue[i-1]=queue[i];
        }
        System.out.println("Dequeued");

    }

    public static void display(){
        int i=0;
        while(i<len){
            System.out.print(queue[i]+"->");
            i++;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        queueUsingArray.enqueue(1);
        queueUsingArray.enqueue(2);
        queueUsingArray.enqueue(3);

        queueUsingArray.display();

        queueUsingArray.dequeue();
        queueUsingArray.display();
    }
}
