package arrays;

public class test4 {
    public int findKthPositive(int[] arr, int k) {
        int n = 1, i = 0;
        while (i < arr.length) {
            if (n != arr[i]) {
                k--;
            } else if (n == arr[i]) {
                i++;
            }
        }
        return n + k - 1;
    }
}
