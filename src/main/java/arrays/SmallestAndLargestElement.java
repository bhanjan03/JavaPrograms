package arrays;

import javax.xml.transform.stream.StreamSource;

public class SmallestAndLargestElement {


    public static void main(String[] args){
        int[]  arr={2,3,4,5,1,3,6,7,8,9};

        int small=arr[0];
        int large=arr[0];

        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }

            if(large<arr[i]){
                large=arr[i];
            }
        }

        System.out.println(small);
        System.out.println(large);


    }
}
