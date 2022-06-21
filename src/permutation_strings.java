public class permutation_strings{

    public static void main(String[] args){

        // printing the permutations of string using recursion
        StringBuilder p = new StringBuilder("");
        permutations(p, "abc");
    }

    private static void permutations(StringBuilder p  , String up  )
    {
        if(up.isEmpty()){

            System.out.println(p);

            return;

        }


        int size = p.length()+1;
        for(int i =0;i<size ; i++){

            permutations(p.insert(i ,up.charAt(0)) , up.substring(1));
            p.deleteCharAt(i);

        }
    }

}