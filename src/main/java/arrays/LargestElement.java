package arrays;

public class LargestElement {

    public static int findLargestNumber(int[] arr){
        int largestNum=arr[0];
        for(int i=0;i<arr.length;i++){
            if (largestNum<arr[i]){
                largestNum=arr[i];
            }
        }
        return  largestNum;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int num=findLargestNumber(arr);
        System.out.println(num);
    }
}
