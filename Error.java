import java.util.*;

public class Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int div = 0;
        
        try {
            div = num1 / num2;
            System.out.println(div);
        } catch (ArithmeticException err) {
            System.out.println("Division by zero error!");
        } finally {
            sc.close();
            System.out.println("Scanner closed");
        }
    }
}
