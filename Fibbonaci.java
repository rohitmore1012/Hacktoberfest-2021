import java.util.*;
class Fibbonaci
{
	public static void main(String arg[])
	{
		int x=0,y=1,z;
		byte i,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter number of elements:");
		n=sc.nextByte();
		
		if(n==1)
		{
			System.out.println(x);
		}
		else if(n==2)
		{
			System.out.println(x+"\t"+y);
		}
		else
		{
			System.out.print(x+"\t"+y);
			for(i=3;i<=n;i++)
			{
				z=x+y;
				System.out.print("\t"+z);
				x=y;
				y=z;
			}
		}
	}
}




	