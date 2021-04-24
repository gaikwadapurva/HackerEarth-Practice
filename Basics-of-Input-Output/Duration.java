import java.util.*;

class Duration {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n -- > 0) {
            int sh = in.nextInt();
            int sm = in.nextInt();
            int eh = in.nextInt();
            int em = in.nextInt();
            int st = (sh * 60) + sm;
            int et = (eh * 60) + em;
            int dh = (et - st) / 60;
            int dm = (et - st) % 60;
            System.out.println(dh + " " + dm);
        }
    }
}
