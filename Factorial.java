import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long ans = 1;
        
        for (int i = 1; i <= num; i++) {
            ans = ans * i;
        }

        int nZero = 0;
        for (int i = num; i >= 5; i /= 5) {
            nZero += num / 5;
            num /= 5;
        }

        System.out.println("The trailing zeros are: " + nZero);
    }
}
