import java.util.*;
class Solution {
    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=val)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
class removeElement
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int nums[]={3,3,4,2,2,3,4,2};
		int val=sc.nextInt();
		System.out.println(Solution.removeElement(nums,val));
		}
}
