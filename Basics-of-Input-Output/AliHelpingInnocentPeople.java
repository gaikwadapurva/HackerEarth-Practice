import java.util.*;

class AliHelpingInnocentPeople {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String letter = s.substring(2,3);
        int d1 = Integer.parseInt(s.substring(0,1));
        int d2 = Integer.parseInt(s.substring(1,2));
        int d3 = Integer.parseInt(s.substring(3,4));
        int d4 = Integer.parseInt(s.substring(4,5));
        int d5 = Integer.parseInt(s.substring(5,6));
        int d6 = Integer.parseInt(s.substring(7,8));
        int d7 = Integer.parseInt(s.substring(8));
        int sum1 = d1 + d2;
        int sum2 = d3 + d4;
        int sum3 = d4 + d5;
        int sum4 = d6 + d7;
        if (!letter.equals("A") && !letter.equals("E")
                && !letter.equals("I") && !letter.equals("O")
                && !letter.equals("U") && !letter.equals("Y") &&
                (sum1 % 2) == 0 && (sum2 % 2) == 0 &&
                (sum3 % 2) == 0 && (sum4 % 2) == 0) {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
    }
}
