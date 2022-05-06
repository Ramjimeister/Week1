package Week1Day1;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int a, b, c=20, d=0;
		for(int i=1; i<5; i++)
		{
			a=6*i-1;
			b=6*i+1;
			if(a==c || b==c)
			{
				System.out.println("Prime Number");
				d=1;
				break;
			}
		}
		if(d==0)
		{
			System.out.println("Not a Prime Number");
		}
	}
}
