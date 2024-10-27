package arrays;

public class SmallestElement {
    public static int smallestElement(int[] arr){
        int smallestNum=arr[0];

        for(int i=0;i<arr.length;i++){
            if (smallestNum>arr[i]){
                smallestNum=arr[i];
            }
        }
        return smallestNum;
    }

    public static void main(String[] args){
        int[] arr={2,3,4,1,5,6,7,8,9};
        int num=smallestElement(arr);
        System.out.println(num);
    }
}
