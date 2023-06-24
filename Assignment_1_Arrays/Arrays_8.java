import java.util.*;

public class Arrays_8 {
    public static int[] findError(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dup = 0;
        int missing = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                dup = num;
            }
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missing = i;
            }
        }

        return new int[]{dup, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findError(nums);
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}