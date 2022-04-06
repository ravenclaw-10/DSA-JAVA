//Inorder: lc,p,rc
//preOrder: p,lc,rc
//postOrder: lc,rc,p

package BinaryTree;

class Node{
    int key;
    Node left,right;
    Node(int k){
        key=k;
        left=right=null;
    }
}

public class BTreeLL {
    static Node root;

    public static void preOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.key+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.key+" ");
    }

    public static int height(Node root){
        if(root==null)
            return 0;
        int r=height(root.right);
        int l=height(root.left);
        if(r>l)
            return r+1;
        if(r<l)
            return l+1;
        return r+1;
    }

    public static void printLevel(Node root,int lvl){
        if(root==null)
            return;
        if(lvl==1)
            System.out.print(root.key+" ");
        else{
            printLevel(root.left,lvl-1);
            printLevel(root.right,lvl-1);
        }
    }

    public static void printTree(Node root,int h){
        for(int j=1;j<=h;j++){
            for(int i=h-j;i>0;i--){
                System.out.print(" "+" ");
            }
            printLevel(root,j);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println("Preorder:");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder:");
        inOrder(root);
        System.out.println();
        System.out.println("Postorder:");
        postOrder(root);
        System.out.println();
        int h=height(root);
        System.out.println("Height="+h);
        printLevel(root,3);
        System.out.println();
        printTree(root,h);
    }
}
