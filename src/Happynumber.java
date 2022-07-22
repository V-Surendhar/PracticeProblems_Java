class Solution {



    public static void main(String[] args){


        Solution obj = new Solution();
//boolean a =obj.isHappy(2) ;
        System.out.println(obj.isHappy(19));

    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;
        do {
            slow = happy(slow);
            fast = happy(happy(fast));



            if( slow == 1){
                return true ;
            }

        }while(slow != fast);



        return false ;



    }

    public int happy(int n){

        int rem = 0 ;
        int sum  = 0;
        while(n > 0){

            rem = n%10 ;
            sum += rem*rem ;
            n = n/10 ;

        }
        return sum ;



    }

}