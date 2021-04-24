import java.util.*;

class ItsMagic {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos = -1;
        int min = Integer.MAX_VALUE;
        int arr[] = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            if ((sum - arr[i]) % 7 == 0 && min > arr[i]) {
                pos = i;
                min = arr[i];
            }
        }
        System.out.println(pos);
    }
}
