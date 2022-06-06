public class Patterns {


    public static void main(String[] args) {




        /*

             *
            * *
           *   *
          *     *
         *********


         */

        for(int i =1 ;i<=4;i++){
           //for begining spaces
            for (int j = 1; j <=5-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            //intermidiate spaces
            for (int k = 0; k < (2*(i-1))-1 ; k++) {
                System.out.print(" ");

            }
            if(i!=1){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int l = 1;l<=9;l++){
            System.out.print("*");
        }


    }


}
