import java.util.*;

class BookOfPotionMaking {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int sum = 0;
        String output = "Illegal ISBN";
        for (int i = 1; i <= str.length(); i++) {
            sum += Integer.parseInt(str.substring(i-1,i)) * i;
        }
        if (sum % 11 == 0) {
            output = "Legal ISBN";
        }
        System.out.println(output);
    }
}
