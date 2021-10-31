import java.util.Scanner;

class Palindrome
{
	public static void main(String arg[])
	{
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		name=sc.nextLine();
		StringBuffer name2=new StringBuffer(name);
		name2.reverse();
		if(name.equalsIgnoreCase(name2.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}