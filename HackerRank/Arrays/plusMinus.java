import java.util.*;
class Result {

    public static void plusMinus(List<Integer> arr) {
 
    int n=arr.size();
    double g=0;
    double l=0;
    double z=0;
    for(int i=0;i<n;i++)
    {
        if(arr.get(i)>0)
        {
            g++;
        }
        else if(arr.get(i)<0)
        {
            l++;
        }
        else
        {
            z++;
    }
    }
    System.out.printf("%6f\n",g/n);
    System.out.printf("%6f\n",l/n);
    System.out.printf("%6f\n",z/n);

    }

}

public class plusMinus {
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<Integer>arr=new ArrayList<>();
		int n=sc.nextInt();//no.of elements in array
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		Result.plusMinus(arr);
		
    }
}
