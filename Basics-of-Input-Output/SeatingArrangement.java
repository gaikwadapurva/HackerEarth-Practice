import java.util.*;
 
class SeatingArrangement {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            String seat_type = "";
            int front_seat = 0;
            if (n%6 <= 1) {
                seat_type = "WS";
            }
            else if (n%3 == 2) {
                seat_type = "MS";
            }
            else {
                seat_type = "AS";
            }
            switch (n%12) {
                case 0: {
                    front_seat = n - 11;
                    break;
                }
                case 1: {
                    front_seat = n + 11;
                    break;
                }
                case 2: {
                    front_seat = n + 9;
                    break;
                }
                case 3: {
                    front_seat = n + 7;
                    break;
                }
                case 4: {
                    front_seat = n + 5;
                    break;
                }
                case 5: {
                    front_seat = n + 3;
                    break;
                }
                case 6: {
                    front_seat = n + 1;
                    break;
                }
                case 7: {
                    front_seat = n - 1;
                    break;
                }
                case 8: {
                    front_seat = n - 3;
                    break;
                }
                case 9: {
                    front_seat = n - 5;
                    break;
                }
                case 10: {
                    front_seat = n - 7;
                    break;
                }
                case 11: {
                    front_seat = n - 9;
                    break;
                }
            }
            System.out.println(front_seat + " " + seat_type);
        }
    }
}