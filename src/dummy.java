/*

TIME COMPLEXITY - O(m^n *n)
SPACE COMPLEXITY - O(m*m)

 */


import java.util.HashMap;

public class dummy  {

    public static void main(String[] args){

        HashMap<String,Boolean > memo = new HashMap<>();
        System.out.println(solution("abcdef","",new String[]{"abc","ab","cd","def","abcd","abcdef"}));
        System.out.println(solution("skateboard","",new String[]{"bo","rd","ate","t","sha","sk","boar","skate","d"}));
        System.out.println(solution("enterapotentpot","",new String[]{"a","p","ent","enter","et","o","t"}));
        // System.out.println(solution("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef","",new String[]{"e","ee","eee","eeee","eeeee","eeeeee"}));


    }

    private static int solution(String s,String newstring,String[] arr){

        int count=0;

        if(canproceed(s,newstring)==2){
            return 1;
        }
        else if(canproceed(s,newstring)==0){
            return 0;
        }


        for(int i =0;i<arr.length;i++){

            if(solution(s,newstring+arr[i],arr)==1){
                count++;

            }

        }
        return count;

    }


    private static int canproceed(String s , String newstring){


        int i=0;
        int j=0;
        while(i!=newstring.length() && j!=s.length()){

            if(newstring.charAt(i) != s.charAt(j)){
                break;
            }

            i++;
            j++;
        }



        if(i==newstring.length() && j==s.length()){
            return 2; // reached the string
        }

        if(i<newstring.length()){
            return 0; //not to continue
        }
        return 1;       //continue

    }

}
