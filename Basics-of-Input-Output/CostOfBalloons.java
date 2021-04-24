import java.util.*;
 
class CostOfBalloons {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int green = in.nextInt();
            int purple = in.nextInt();
            long min = 0, max = 0;
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                int first = in.nextInt();
                int second = in.nextInt();
                min += (first * green) + (second * purple);
                max += (first * purple) + (second * green);
            }
            System.out.println(min < max ? min:max);
        }
    }
}