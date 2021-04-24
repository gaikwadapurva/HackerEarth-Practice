import java.util.*;

class SplitHouses {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        if (s.contains("HH")) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
            String newString = s.replace(".","B");
            System.out.println(newString);
        }
    }
}
