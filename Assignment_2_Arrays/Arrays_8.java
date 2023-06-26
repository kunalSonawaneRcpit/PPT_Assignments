class Arrays_8{
    public static int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
            min+=k;
            max-=k;
        
        return Math.max(0,max-min);
    }
    public static void main(String ar[])
    {
       int nums[]={0,10},k=2;
       System.out.println("Output: "+smallestRangeI(nums,k)); 
    }
}