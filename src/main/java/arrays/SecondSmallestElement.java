package arrays;

import java.util.Arrays;

public class SecondSmallestElement {

    public static int secondSmallestNum(int[] arr){
        Arrays.sort(arr);
        int secondSmallNum=arr[1];
        return secondSmallNum;
    }

    public static int secondSmallestNum1(int[] arr){
        int firstSmallestnum=Integer.MAX_VALUE;
        int secSmallestnum=Integer.MAX_VALUE;

        System.out.println(firstSmallestnum);

        System.out.println(secSmallestnum);

        for(int i=0;i<arr.length;i++){
            if(firstSmallestnum>arr[i]){
                firstSmallestnum=arr[i];
            }
        }


        for(int i=0;i<arr.length;i++){
            if(secSmallestnum>arr[i] && arr[i]!=firstSmallestnum){
                secSmallestnum=arr[i];
            }
        }

        return  secSmallestnum;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};

        int num = secondSmallestNum(arr);
        System.out.println(num);

        int num2 = secondSmallestNum1(arr);
        System.out.println(num2);
    }
}
