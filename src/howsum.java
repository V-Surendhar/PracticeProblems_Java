


import java.util.ArrayList;
import java.util.HashMap;

public class howsum {

    public static void main(String[] args){


        int[] arr = {2,3,5};
        int a = 8;
        HashMap<Integer,Boolean> memo = new HashMap<>();


        System.out.println(solution(7, new int[]{2, 3},memo));         //true
        memo.clear();
        System.out.println(solution(7, new int[]{5, 3, 4, 7},memo));   //true
        memo.clear();
        System.out.println(solution(7, new int[]{2, 4},memo));         //false
        memo.clear();
        System.out.println(solution(8, new int[]{2, 3, 5},memo));      //true
        memo.clear();
        System.out.println(solution(300, new int[]{7, 14},memo));      //false

        System.out.println(brr);

    }

    private static ArrayList<Integer> brr = new ArrayList<>();


    public static boolean solution(int a , int[] arr ,HashMap<Integer,Boolean> memo){

        if(a==0){
            return true;

        }
        if(a<0)
        {
            return false;
        }

        if(memo.containsKey(a)){
            return memo.get(a);
        }

        for(int i = 0;i<arr.length;i++){

            if(solution(a-arr[i],arr,memo)){

                memo.put(a,true);
                brr.add(arr[i]);
                return memo.get(a);
            }

        }

        return false;
    }
}
