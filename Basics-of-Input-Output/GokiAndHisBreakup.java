import java.util.*;

class GokiAndHisBreakup {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int y = in.nextInt();
            if (y >= x) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
