public class TwelveApril {
    public static int[] productArrayExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            output[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            output[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;
    }

    public static boolean increasingTripletSequence(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min1) {
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
