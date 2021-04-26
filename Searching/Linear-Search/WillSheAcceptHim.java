import java.util.*;

class WillSheAcceptHim {
    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        int j = 0;
        for (int i = 0; i < n && j < m; i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }
        return (j == m);
    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t -- > 0) {
            String guyName = in.next();
            String crushName = in.next();
            int gnl = guyName.length(), cnl = crushName.length();
            boolean flag = isSubSequence(guyName, crushName, gnl, cnl);
            String output = "We are only friends";
            if (flag) {
                output = "Love you too";
            }
            System.out.println(output);
        }
    }
}
