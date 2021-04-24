import java.util.*;

class Zoos {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int countZ = 0;
        int countO = 0;
        int i = 0;
        int len = s.length();
        while (i < len && s.charAt(i) == 'z') {
            countZ++;
            i++;
        }
        while (i < len && s.charAt(i) == 'o') {
            countO++;
            i++;
        }
        if ((countZ * 2) == countO) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
