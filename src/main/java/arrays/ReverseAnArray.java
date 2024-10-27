package arrays;


public class ReverseAnArray {

    public static void reverseArray(int[] arr){
        int start=0;
        int length=arr.length;
        int end=length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
       // Time – Complexity : O(n)
        //Space-Complexity : O(1)
    }

    public static void reverseArray1(int[] arr){

        int n=arr.length;
        for(int i=n-1; i>=0; i--)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        //Method 1: Just print the array in reverse order
        //Method 2: Actual in-place reversing of the original array
        //Method 3: Recursive in-place reversing of the original array
        int[] arr={10, 20, 30, 40, 50};
        reverseArray(arr);
        System.out.println("+++++++++++++++========");
        int[] arr1={10, 20, 30, 40, 50};
        reverseArray1(arr1);
    }
}
