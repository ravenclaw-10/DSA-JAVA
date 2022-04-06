package SearchingAndSorting;

public class sort {

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
               if(arr[i]>arr[j]){
                   swap(arr,i,j);
               }
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
