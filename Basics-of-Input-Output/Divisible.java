import java.util.*;

class Divisible {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String output = "NON";
        long num = 0;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            String val = in.next();
            if (i <= n/2) {
                num = Integer.parseInt(val.substring(0,1));
            }
            else {
                num = Long.parseLong(val) % 10;
            }
            if (i % 2 == 0) {
                sum += num;
            }
            else {
                sum -= num;
            }
        }
        if (sum % 11 == 0) {
            output = "OUI";
        }
        System.out.println(output);
    }
}
