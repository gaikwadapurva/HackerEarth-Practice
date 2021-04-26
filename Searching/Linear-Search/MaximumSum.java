import java.util.*;

class MaximumSum {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        long sum = 0, count = 0;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
            if (max < arr[i]) {
                max = arr[i];
            }
            if (arr[i] >= 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count == 0) {
            sum = max;
            count = 1;
        }
        System.out.print(sum + " " + count);
    }
}
