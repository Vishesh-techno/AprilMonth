public class FourteenApril {
    public static double findMaxAvg(int[] nums, int k) {
        int n = nums.length;
        double sum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        for (int i = k; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 3, -3};
        int k = 4;
        System.out.println(findMaxAvg(nums, k));
    }
}
