import java.util.*;

class SimpleSearch {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        long k = in.nextLong();
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                pos = i;
                break;
            }
        }
        System.out.print(pos);
    }
}
