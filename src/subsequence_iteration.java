import java.util.*;

public class subsequence_iteration{
    public static void main(String[] args) {


        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList());
        int[] arr = {1,2,3};

        for(int num : arr){

            int size = outer.size();

            for(int i=0;i<size;i++){
                List<Integer> inner = new ArrayList(outer.get(i));
                inner.add(num);
                outer.add(inner);

            }



        }

        System.out.println(outer);

/*
        for(List<Integer> a : outer){

            for(int b : a)
            {
                System.out.print(b +" ");
            }
            System.out.println();
        }
*/
    }
}
