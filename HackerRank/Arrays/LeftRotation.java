import java.util.*;

class Result {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        int n = arr.size();
        d = d % n;

        List<Integer> result = new ArrayList<>();

        // d से अंत तक
        for (int i = d; i < n; i++) {
            result.add(arr.get(i));
        }

        // 0 से d-1 तक
        for (int i = 0; i < d; i++) {
            result.add(arr.get(i));
        }

        return result;
    }
}

public class leftRotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter number of left rotations: ");
        int d = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> result = Result.rotateLeft(d, arr);

        System.out.println("Array after left rotation:");

        for (Integer num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}