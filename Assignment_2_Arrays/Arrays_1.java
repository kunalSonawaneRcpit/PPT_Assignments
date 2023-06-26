import java.util.*;
public class Arrays_1 {
    public static void main(String[] args) {
        int[] nums={1,4,3,2};
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                sum=sum+nums[i];
            }
        }
        System.out.println(sum);
    }
}
