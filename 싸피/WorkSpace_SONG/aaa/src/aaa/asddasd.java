package aaa;

import java.util.*;

public class asddasd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums); // Sort the numbers in ascending order

        int low = 0, high = n - 1, guesses = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            guesses++;
            if (nums[mid] == mid) {
                System.out.println(guesses);
                return;
            } else if (nums[mid] > mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("-1"); // If we reach here, it means Alice's number is not in the list
    }
}