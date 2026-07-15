import java.util.*;
class Solution {
    public static int removeDuplicates(int[] nums) {
        
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
}
}
class removeDuplicatesFromSortedArray
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size of Array:");
		int n=sc.nextInt();
		int nums[]=new int[n];
		
		System.out.println("Enter The Array: ");
		
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			nums[i]=a;
		}
		System.out.println(Solution.removeDuplicates(nums));
	}
}