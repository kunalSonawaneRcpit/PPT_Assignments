public class Arrays_1 {

    public static int[] addTarget(int nums[], int target)
    {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] ans=addTarget(nums,target);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
