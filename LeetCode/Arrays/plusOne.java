import java.util.*;

class plusOne {

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // if digit is not 9
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }

            // if digit is 9
            digits[i] = 0;
        }

        // if all digits were 9
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        System.out.println("Enter the digits:");

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int[] result = plusOne(digits);

        System.out.print("Output: ");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}