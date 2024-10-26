package arrays;

public class PrintAlternateNumber {

    public static void printAlternate(int[] arr){
        for(int i=0;i< arr.length;i=i+2){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6,7,8,9};
        printAlternate(arr);
    }
}
