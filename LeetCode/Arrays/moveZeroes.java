import java.util.*;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int write = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[write] = nums[i];
                write++;
            }
        }

        // Fill the remaining positions with 0
        for (int i = write; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZeroes(nums);

        System.out.println("Array after moving zeroes:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}