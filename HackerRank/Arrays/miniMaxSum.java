import java.util.*;

public class miniMaxSum {

    public static void miniMaxSum(int[] arr) {

        long total = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        // Calculate total sum
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        // Find minimum and maximum sum
        for (int i = 0; i < arr.length; i++) {
            long currentSum = total - arr[i];

            if (currentSum < min) {
                min = currentSum;
            }

            if (currentSum > max) {
                max = currentSum;
            }
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        miniMaxSum(arr);

        sc.close();
    }
}