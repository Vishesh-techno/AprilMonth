import java.util.Arrays;

public class ThirteenApril {
    public static void moveZeros(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        while (idx < nums.length) {
            nums[idx] = 0;
            idx++;
        }
    }

    public static int containerWithMostWater(int[] nums) {
        int maxWater = 0;
        int h = 0, w = 0;
        int currWater = 0;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            h = Math.min(nums[left], nums[right]);
            w = right - left;
            currWater = h * w;
            maxWater = Math.max(currWater, maxWater);
            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
    public static final int hello = 100;
    boolean hell = true;

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(containerWithMostWater(nums));
    }
}
