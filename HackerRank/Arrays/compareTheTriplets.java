import java.util.*;
class demo
{
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
	{
		List<Integer>li=new ArrayList<>();
		int alice=0;
		int bob=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)>b.get(i))
			{
				alice++;
			}
			else if(a.get(i)<b.get(i)){
				bob++;
			}
		}
		li.add(alice);
		li.add(bob);
		return li;
		
	}
}
class compareTheTriplets
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		List<Integer>a=new ArrayList<>();
		List<Integer>b=new ArrayList<>();
		System.out.println("Enter the size of each array");
		int n=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter values of 'a' Array:");
		for(int i=0;i<n;i++)
		{
			int a1=sc.nextInt();
			a.add(a1);
		}
		System.out.println("Enter values of 'b' Array:");
		for(int j=0;j<n;j++)
		{
			int b1=sc.nextInt();
			b.add(b1);
		}
		System.out.println(demo.compareTriplets(a,b));
	}
}