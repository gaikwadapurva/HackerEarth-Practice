import java.util.*;

class PalindromicString {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        String output = "NO";
        if (str.equals(rev)) {
            output = "YES";
        }
        System.out.println(output);
    }
}
