import java.util.*;

public class drome {
    static boolean check(int n) {
        int rev = 0, temp;
        while (n > rev) {
            temp = n % 10;
            rev = (rev * 10) + temp;
            n /= 10;
        }
        return n == rev || n == rev / 10;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (check(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}
