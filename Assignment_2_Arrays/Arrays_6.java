import java.util.*;
class Arrays_6 {
    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid]<target)
            {
                start=mid+1;
            }else if(nums[mid]>target)
            {
                end=mid-1;
            }
        }
        return -1;
    }
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size OF Array And Target element:");
		int n=sc.nextInt();
		int target=sc.nextInt();
		System.out.println("Enter array Element :\n");
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("Output: "+search(nums,target));
    }
}