import java.util.*;

class CharSum {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        char ch = 'a';
        for (int i = 1; i <= 26; i++) {
            map.put(ch, i);
            ch++;
        }
        String s = in.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = map.get((Character)s.charAt(i));
            sum += val;
        }
        System.out.println(sum);
    }
}
