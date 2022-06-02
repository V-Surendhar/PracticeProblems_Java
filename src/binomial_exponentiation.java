public class binomial_exponentiation
{
    public static void main(String[] args) {
        power(2,-10);
    }

    private static void power(double x, int n) {
        double ans =1.0;
        long nn=n;
        if ((nn < 0)) {
            nn *= -1;
        }

        while(nn>0) {
            if (nn% 2 == 0) {
                x = x * x;
                nn= nn/ 2;
            } else {
                ans = ans * x;
                nn = nn - 1;
            }
        }

        System.out.println((n<0) ?  Double.toString(1.0/ans) : ans);



    }


}
