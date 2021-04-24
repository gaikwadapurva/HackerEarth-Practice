import java.util.*;

class BackToSchool {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max_ab = (a > b) ? a : b;
        int max_abc = (max_ab > c) ? max_ab : c;
        System.out.println(max_abc);
    }
}
