import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,69,8,2,6,1};
        bubble(arr);
    }

    private static void bubble(int[] arr) {

        for(int i = 0; i< arr.length ;i++)
            for(int j = 0 ; j<arr.length-1;j++){

                if(arr[j] > arr[j+1]){
                    // swap
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];


                }


            }
        System.out.println(Arrays.toString(arr));

    }
}
