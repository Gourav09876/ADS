public class PrefixSumExample {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};
        int n = arr.length;

        // Build prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Range [l, r]
        int l = 0;
        int r = 3;
        int sum;

        if (l == 0) {
            sum = prefix[r];
        } else {
            sum = prefix[r] - prefix[l - 1];
        }

        System.out.println(sum);
    }
}