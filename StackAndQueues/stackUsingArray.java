package StackAndQueues;

public class stackUsingArray {
    public static int top=-1;
    public static int len=5;
    public static int[] stack=new int[len];

    public static void push(int val){
        if(top>=len-1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=val;
    }

    public static void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }

    public static int peek(){
        return stack[top];
    }

    public static boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }

    public static boolean isFull(){
        if(top==len)
            return true;
        return false;
    }

    public static void display(){
        int itr=top;
        while(itr>=0){
            System.out.print(stack[itr]+"->");
            itr--;
        }
        System.out.println("BOTTOM");
    }

    public static void main(String[] args) {
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        stackUsingArray.push(3);

        stackUsingArray.display();
        stackUsingArray.pop();
        stackUsingArray.display();

        System.out.println(stackUsingArray.peek());

    }
}
