public class dummy{


    public static void main(String[] args)
    {

        int[][] arr = new int[3][3];
        findways(arr , 0 , 0,"");



    }


    public static void findways(int[][] arr,int r , int c,String p){


        if(c<arr[0].length-1){
            findways(arr,r,c+1,p+"R");
        }
        if(r<arr.length-1)
        {
            findways(arr, r+1,c,p+"D");
        }

        if(r==arr.length-1 && c== arr[0].length-1){

            System.out.println(p);

        }



    }


}