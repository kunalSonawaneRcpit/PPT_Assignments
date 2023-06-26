class Arrays_7{
    public static boolean isMonotonic(int[] nums) {
        boolean decreasing=false;
        boolean increasing=false;
       for(int i=1;i<nums.length;i++)
       {
           if(nums[i] > nums[i-1]){
               increasing=true;
           }
           else if(nums[i] < nums[i-1]){
               decreasing=true;
           }
           
       }
        boolean result = (increasing && decreasing) ? false:true;
        return result;

    }

	public static void main(String arg[])
	{

		int nums[]={1,2,2,3};
		System.out.println("Output:"+isMonotonic(nums));
	}
}