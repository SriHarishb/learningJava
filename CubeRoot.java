import java.util.*;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        float num = input.nextFloat();

        float left = 0;
        float right = num;
        float mid = (left + right) / 2;
        int x = 0;

        if (x * x * x < num) {
            while (x * x * x < num) {
                x++;
            }
        }
        if (x * x * x == num) {
            System.out.println("Perfect cube root: " + x);
        } else {
            while (Math.abs(mid * mid * mid - num) > 0.00001) {
                if (mid * mid * mid > num) {
                    right = mid;
                } else {
                    left = mid;
                }
                mid = (left + right) / 2;
            }
            System.out.println("Approximate cube root: " + mid);
        }
    }
}
