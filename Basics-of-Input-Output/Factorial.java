import java.util.*;

class Factorial {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long fact = n;
        for (int i = 2; i < n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
