public class Arrays_2 {
    public static void main(String[] args) {
        int[] nums={6,7,7,0,7,3,6,8,7,8};
        int val=8;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(k);
        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
