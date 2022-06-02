public class find_rbs {

    public static void main(String[] args) {
        int[] arr = {9,10,1,2,3,4,5,6};

        /*
        {9,1,2,3,4,5,6,7}
        {9,10,1,2,3,4,5,6}
        {9,10,11,1,2,3,4,5}
        {9,10,11,12,1,2,3,4}
        {9,10,11,12,13,1,2,3}
        {9,10,11,12,13,14,1,2}
        {9,10,11,12,13,14,15,1}
        */

        System.out.println(findpeak(arr));

    }

    public static int findpeak(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            if(start < mid && arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            if(arr[mid] <= arr[end]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
            }
        return -1;

    }
}


/*
// MY ALGORITHM
public class find_rbs {

    public static void main(String[] args) {
        int[] arr ={9,10,11,12,13,14,15,16}  ;

        System.out.println(findpeak(arr));

    }

    public static int findpeak(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;

        while(start<=end){

            mid = (start+end)/2;

            if(start == mid){
                if(arr[mid] < arr[mid+1]){
                    return -1;
                }
                return arr[mid];
            }

            if(arr[mid] < arr[start]){
                end = mid;
                continue;
            }
            if(arr[mid]>arr[start]){
                start =mid;
                continue;
            }



        }



        if(start==arr.length-1){
            return -1;
        }
        return 0 ;
    }

}
*/

