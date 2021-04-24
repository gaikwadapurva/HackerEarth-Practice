import java.util.*;

class Cipher {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String ans = "";
        int k = in.nextInt();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int newk = k;
            if (ch >= 48 && ch <= 57) {
                if (k >= 10) {
                    newk = k % 10;
                }
                int newValue = ch + newk;
                if (newValue > 57) {
                    newValue = (newValue - 58) + 48;
                }
                ans += Character.toString((char)newValue);
            }
            else if (ch >= 'a' && ch <= 'z') {
                if (k >= 26) {
                    newk = k % 26;
                }
                int newValue = ch + newk;
                if (newValue > 122) {
                    newValue = (newValue - 123) + 97;
                }
                ans += Character.toString((char)newValue);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                if (k >= 26) {
                    newk = k % 26;
                }
                int newValue = ch + newk;
                if (newValue > 90) {
                    newValue = (newValue - 91) + 65;
                }
                ans += Character.toString((char)newValue);
            }
            else {
                ans += Character.toString(ch);
            }
        }
        System.out.println(ans);
    }
}
