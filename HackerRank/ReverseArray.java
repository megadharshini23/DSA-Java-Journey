
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] reverse = new int[n];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[j] = arr[i];
            j++;
        }

        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }

        sc.close();
    }
}