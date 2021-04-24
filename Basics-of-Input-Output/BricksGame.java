import java.util.*;

class BricksGame {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String output = "";
        int n = in.nextInt();
        int round = 0;
        while (n > 0) {
            round++;
            if (n <= round) {
                output = "Patlu";
                break;
            }
            else {
                n -= round;
                if (n <= (2 * round)) {
                    output = "Motu";
                    break;
                }
                else {
                    n -= (2 * round);
                }
            }
        }
        System.out.print(output);
    }
}
