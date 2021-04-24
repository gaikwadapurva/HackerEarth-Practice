import java.util.*;

class PrintTheNumbers {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = in.nextInt();
            System.out.print(num + " ");
        }
    }
}
