import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ret = 0, gap = Integer.MAX_VALUE;

        if (nums.length == 3) return Arrays.stream(nums).sum();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            
            int m = i + 1;
            int e = nums.length - 1;

            // -5 -5 -4 0 0 3 3 4 5  / -2
            while (m < e) {
                int sum = 0;
                sum += nums[i] + nums[m] + nums[e];

                int newGap = Math.abs(target - sum);

                if (newGap < gap) {
                    gap = newGap;
                    ret = sum;
                }

                if (sum < target) {
                    m++;
                } else if (sum > target) {
                    e--;
                } else {
                    return sum;
                }

            }
        }

        return ret;
    }


}