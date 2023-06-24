public class Arrays_3 {

    public static int search(int nums[],int target)
    {
        int low=0,high=nums.length-1,mid,flag=0;
        for(int i=0;i<nums.length;i++)
        {
            mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                flag=1;
                return mid;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums= {3,4,5,6,8,9};
        int num=7;
        int n=search(nums,num);
        System.out.println(n);
    }
}
