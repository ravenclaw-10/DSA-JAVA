package SearchingAndSorting;

public class quickSort {

    public static void swap(int[] arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }

    public static int partition(int[] arr, int l, int r){
        int p=arr[r];
        int i=l-1;
        for(int j=l;j<=r;j++){
            if(arr[j]<p){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }

    public static void qSort(int[] arr,int l, int r){
        if(l<r){
            int p=partition(arr,l,r);
            qSort(arr,l,p-1);
            qSort(arr,p+1,r);
        }
    }

    public static void display(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr={4,3,2,1,5,6,4};
        qSort(arr,0,arr.length-1);
        display(arr);
    }
}
