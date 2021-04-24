import java.util.*;

class DoctorsSecret {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int pages = in.nextInt();
        if (len <= 23 && len > 0 && pages >= 500 && pages <= 1000) {
            System.out.println("Take Medicine");
        }
        else {
            System.out.println("Don't take Medicine");
        }
    }
}
