public class FactorielleMain {
    static int factorielle(int n){
        int res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }

    static double compute_pi(int max_iter){
        double res = 0;
        int sign = 1;
        for (int i = 0; i < max_iter; i++){
            res += (double)sign / (2 * i + 1);
            sign *= -1;
        }
        return 4 * res;
    }
    
    static double compute_sqrt(double x, int max_iter){
        double res = 1.;
        for (int i = 0; i < max_iter; i++){
            res = (res + x / res) / 2;
        }
        return res;
    }
    
    static double compute_sqrt(double x){
        return compute_sqrt(x, 10);
    }

    static int pgcd(int a, int b){
        int t = 0;
        while (b != 0){
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(n + "! = " + factorielle(n));
        
        System.out.println("Pi = " + compute_pi(2) + " after 2 iterations");
        System.out.println("Pi = " + compute_pi(10) + " after 10 iterations");
        System.out.println("Sqrt(2) = " + compute_sqrt(2, 1000000) + " after 1 000 000 iterations");
        System.out.println("Pi = " + compute_pi(100) + " after 100 iterations");
        System.out.println("Pi = " + compute_pi(1000) + " after 1000 iterations");
        System.out.println("Pi = " + compute_pi(1000000) + " after 1 000 000 iterations");

        System.out.println("Sqrt(2) = " + compute_sqrt(2) + " after 10 iterations");
        System.out.println("Sqrt(10) = " + compute_sqrt(10) + " after 10 iterations");
        
        System.out.println("PGCD(95, 57) = " + pgcd(95, 57));
    }
}
