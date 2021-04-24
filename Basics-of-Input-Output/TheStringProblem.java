import java.util.*;

class TheStringProblem {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t -- > 0) {
            String s = in.next();
            if ((s.contains("a") && s.contains("e") && s.contains("i")
                    && s.contains("o") && s.contains("u")) ||
                    (s.contains("A") && s.contains("E") && 
                    s.contains("I") && s.contains("O") &&
                    s.contains("U"))) {
                System.out.println("lovely string");
            }
            else {
                System.out.println("ugly string");
            }
        }
    }
}
