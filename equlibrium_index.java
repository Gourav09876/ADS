public class equlibrium_index {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        // Step 1: Create prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Total sum of array
        int totalSum = prefix[n - 1];

        // Step 2: Find equilibrium index
        for (int i = 0; i < n; i++) {

            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = totalSum - prefix[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index = " + i);
                return;
            }
        }

        System.out.println("No Equilibrium Index found");
    }
}
