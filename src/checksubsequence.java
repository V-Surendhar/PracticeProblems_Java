public class checksubsequence
{
    public static void main(String[] args) {


        String s1 = "abc";
        String s2 = "abdfg";

        int p1 = 0;
        int p2 =0;
        boolean flag = true;
        while(p2<s2.length() && p1<s1.length()){


            if(s1.charAt(p1) == s2.charAt(p2)){

                flag &= true ;
                p1++;
                p2++;

            }
            else{
                p2++;
            }
        }


        if(p2 == s2.length() && p1 < s1.length()){

            flag&= false ;
        }
        System.out.println(flag);


    }
}
