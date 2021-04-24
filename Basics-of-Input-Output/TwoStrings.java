import java.util.*;

class TwoStrings {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t -- > 0) {
            String s1 = in.next();
            String s2 = in.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                Character ch = (Character)s1.charAt(i);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                }
                else {
                    map.put(ch, 1);
                }
            }
            String output = "YES";
            for (int i = 0; i < s2.length(); i++) {
                Character ch = (Character)s2.charAt(i);
                if (map.containsKey(ch)) {
                    if (map.get(ch) == 1) {
                        map.remove(ch);
                    }
                    else {
                        map.put(ch, map.get(ch) - 1);
                    }
                }
                else {
                    output = "NO";
                    break;
                }
            }
            System.out.println(output);
        }
    }
}
