import java.util.*;

class EMazeIn {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                x -= 1;
            }
            else if (s.charAt(i) == 'R') {
                x += 1;
            }
            else if (s.charAt(i) == 'D') {
                y -= 1;
            }
            else {
                y += 1;
            }
        }
        System.out.print(x + " " + y);
    }
}
