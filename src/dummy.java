import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> countSmaller(int[] arr) {

        pair[] pairs=new pair[arr.length];

        for(int i=0;i<arr.length;i++){
            pairs[i]=new pair(i,arr[i]);
        }
        int[] count_smaller=new int[arr.length];

        mergesortInplace(pairs,0,arr.length-1,count_smaller);


        ArrayList<Integer> list = new ArrayList<>();

        for(Integer a:count_smaller){
            list.add(a);
        }

        return list ;

    }






    private  void mergesortInplace(pair[] pairs , int s, int e,int[] count_smaller){



        if(s==e){
            return;
        }

        int mid = (s+e)/2;

        mergesortInplace(pairs,s,mid,count_smaller);
        mergesortInplace(pairs,mid+1,e,count_smaller);



        int i = s;
        int j = mid+1;


        int smallerNumbers=0;

        LinkedList<pair> merged = new LinkedList<pair>();



        while(j<=e && i<mid+1){


            if(pairs[i].value<=pairs[j].value){

                count_smaller[pairs[i].index]+=smallerNumbers;
                merged.add(pairs[i]);


                i++;


            }
            else{

                merged.add(pairs[i]);
                smallerNumbers++;
                j++;

            }




        }
        while(i<mid+1){

            merged.add(pairs[i]);
            count_smaller[pairs[i].index]+=smallerNumbers;


            i++;

        }

        while(j<=e){

            merged.add(pairs[j]);


            j++;

        }
        int pos = s;
        for (pair m : merged) {
            pairs[pos] = m;
            ++pos;
        }



    }





    public static class pair{

        int index;
        int value;

        pair(int index,int value){
            this.value=value;
            this.index=index;
        }


    }



}



