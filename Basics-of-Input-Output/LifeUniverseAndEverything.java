import java.util.*;

class LifeUniverseAndEverything {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int val = in.nextInt();
            if (val == 42) {
                flag = false;
            }
            else {
                System.out.println(val);
            }
        }
    }
}
