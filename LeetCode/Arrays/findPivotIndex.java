import java.util.*;

public class findPivotIndex {

    public static int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            // Left Sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Right Sum
            for (int k = i + 1; k < nums.length; k++) {
                rightSum += nums[k];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = pivotIndex(nums);

        System.out.println("Pivot Index = " + result);

        sc.close();
    }
}