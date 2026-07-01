import java.util.Scanner;
class Solution {
    public void delete(int[] arr, int pos, int n) {
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position to delete");
        int pos = sc.nextInt();
        Solution s = new Solution();
        s.delete(arr, pos, n);
        sc.close();
    }
}