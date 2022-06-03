import java.util.Arrays;

public class insertionsort {

    public static void main(String[] args) {

        int[] arr = { 1,3,4,5,2};
        is(arr);
    }

    private static void is(int[] arr) {

    int i =1;
    while(i<arr.length){
        int k =i;
        for(int j = k-1 ; j>-1;j--){
            if(arr[j]<arr[k]){
                swap(arr, j ,k);
                k--;
            }
            else{
                break;
            }
        }
        i++;
    }
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr , int first , int second){

        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }


}
