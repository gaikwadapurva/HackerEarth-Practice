import java.util.*;

class Divisibility {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        if (arr[n-1] % 10 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
