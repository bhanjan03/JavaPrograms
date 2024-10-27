package arrays;

public class SortingElements {

    public static void sort(int[] arr){
        int temp=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] arr={9,5,4,8,1,2,3,5,6,7};
        sort(arr);
    }
}
