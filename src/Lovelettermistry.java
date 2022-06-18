import java.util.Scanner;

public class Lovelettermistry {

    public static void main(String[] args) {


            String s ="bafhaef";
            System.out.println(findfirst(s));

    }
    private static int findfirst(String s) {

        int i=0;
        int count =0;
        int condition = (s.length() %2 == 0) ? s.length()/2 -1 : s.length()/2 ;
        for(int preference =s.length()-1 ; preference >condition;preference--){


            if(s.charAt(preference) > s.charAt(i)){
                count+=s.charAt(preference) - s.charAt(i);
                i++;
            }
            else {

                count = findsecond(s);
                break;
            }

        }
        return count;
}


public  static  int findsecond(String s){

    int i=s.length()-1;
    int count =0;
    int condition = (s.length() %2 == 0) ? s.length()/2-1 : s.length()/2 ;
    for(int preference = 0  ; preference < condition;preference++){


        if(s.charAt(preference) > s.charAt(i)){
            count+=s.charAt(preference) - s.charAt(i);
            i--;
        }
        else  {
            return 0;
        }
    }
    return count;



}



}
