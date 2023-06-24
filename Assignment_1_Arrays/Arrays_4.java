public class Arrays_4 {

    public static int[] incrementLast(int arr[])
    {
        int len=arr.length;
        int data=arr[len-1];
        data++;
        arr[len-1]=data;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] ans=new int[arr.length];
        ans=incrementLast(arr);
        for(int num:ans)
        {
            System.out.print(num+" ");
        }
    }
}
