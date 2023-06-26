class Arrays_4{
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(n==0){
                return true;
            }
        for(int i=0;i<flowerbed.length;i++)
        {
            
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 ||flowerbed[i+1]==0))
            {
                count++;
                
                if(count==n)
                {
                    return true;
                }
                i++;

            }
        }
        
        return false;
    }

	public static void main(String ar[])
	{
	 int nums[]={1,0,0,0,1},n=2;
	 System.out.println("Output:"+canPlaceFlowers(nums,n));
	}
}