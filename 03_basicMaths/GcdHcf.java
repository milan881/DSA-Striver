package basicMaths;

public class GcdHcf {

    public static void main(String[] args) {
        int n = 9;
        int n2 = 12;
        int gcd = 1;

        for (int i = 1; i <= Math.min(n, n2); i++) {
            if (n % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD of " + n + " and " + n2 + " is: " + gcd);
    }
}
