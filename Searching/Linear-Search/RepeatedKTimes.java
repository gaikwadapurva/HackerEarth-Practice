import java.util.*;

class RepeatedKTimes {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n -- > 0) {
            int num = in.nextInt();
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }
        int k = in.nextInt();
        int min = Integer.MAX_VALUE;
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry mapElement = (Map.Entry)itr.next();
            int val = (int)mapElement.getValue();
            int key = (int)mapElement.getKey();
            if (val == k && min > key) {
                min = key;
            }
        }
        System.out.print(min);
    }
}
