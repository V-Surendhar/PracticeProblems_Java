import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {

        int[] arr = { 4,3,2,7,8,2,3,1};
        cs(arr);

    }

    private static void cs(int[] arr) {
        int i =0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i]>arr.length) {
                i++;
            }
            else if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }  else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}
