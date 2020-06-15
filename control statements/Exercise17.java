
public class Exercise17{
	public static void main(String args[])
	{
			String a=args[0];
			String b=new StringBuffer(a).reverse().toString();
			if(a.equals(b))
			{
				System.out.println(a+" is a palindrome");
			}
			else
			{
				System.out.println(a+" is not a palindrome");
			}
	} 
}
