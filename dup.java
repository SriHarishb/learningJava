import java.util.*;

public class dup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int noOfElements = input.nextInt();
        int[] list = new int[noOfElements];
        
        for (int i = 0; i < noOfElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list[i] = input.nextInt();
        }

        for (int i = 0; i < noOfElements; i++) {
            for (int j = i + 1; j < noOfElements; j++) {
                if (list[i] == list[j]) {
                    System.out.println("Contains duplicates");
                    return;
                }
            }
        }
        System.out.println("No duplicates found");
    }
}
