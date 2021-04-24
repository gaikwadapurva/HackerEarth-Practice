import java.util.*;

class AMovement {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int steps = 0;
        for (int i = 5; i >= 1 && n > 0; i--) {
            steps += n/i;
            n = n%i;
        }
        System.out.println(steps);
    }
}
