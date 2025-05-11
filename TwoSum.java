import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int noOfElements = input.nextInt();
        
        int[] list = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list[i] = input.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = input.nextInt();
        
        boolean found = false;
        for (int i = 0; i < noOfElements; i++) {
            for (int j = i + 1; j < noOfElements; j++) {
                if (list[i] + list[j] == target) {
                    System.out.println("Target " + target + " found by summing " + list[i] + " and " + list[j]);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        
        if (!found) {
            System.out.println("No two elements sum up to the target value.");
        }
    }
}
