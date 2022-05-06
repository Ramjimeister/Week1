package Week1Day1;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int a=8, i, F=0;
		for(i=1; i<8; i++)
		{
			F=a*i;
			a=F;
		}
		
		System.out.println(F);
	}
}
