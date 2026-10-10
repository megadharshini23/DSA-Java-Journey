
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;

            if (map.containsKey(needed)) {
                return new int[] {map.get(needed), i};
            }

            map.put(current, i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = {5, 1, 7, 3};
        int target = 8;

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
