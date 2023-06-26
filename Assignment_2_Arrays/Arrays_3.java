import java.util.HashMap;
import java.util.Map;

public class Arrays_3 {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxLen = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            int currentLen = freq.getOrDefault(num, 0);
            int nextLen = freq.getOrDefault(num + 1, 0);
            if (nextLen > 0) {
                int length = currentLen + nextLen;
                if (length > maxLen) {
                    maxLen = length;
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(findLHS(nums)); 
    }
}
