import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length == 1) {
            return new ArrayList<>();
        }

        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int mid = i + 1;
            int end = nums.length - 1;

            while (mid < end) {
                if (nums[i] + nums[mid] + nums[end] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[mid]);
                    list.add(nums[end]);

                    set.add(list);
                    
                    end--;

                } else if (nums[i] + nums[mid] + nums[end] < 0) {
                    mid++;
                } else {
                    end--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}

// -4 -1 -1 0 1 2

//시간 초과

//for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//
//                        Collections.sort(list);
//                        set.add(list);
//                    }
//                }
//            }
//        }
//     List<List<Integer>> ans = new ArrayList<>(set);
//
//        return ans;