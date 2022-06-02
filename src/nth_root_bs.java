public class nth_root_bs {
    public static void main(String[] args) {
        root(3,27);

    }

    private static void root(int n, int x) {

        double start =0;
        double end = x;
        double precision = 1e-6;

        while((end-start)>precision) {
            double mid = (start+end)/2;
            if (Math.pow(mid, n) > x) {
                start = mid;
            } else {
                start = mid;
            }
        }
        System.out.println(start+"  "+end);


        }


    }

