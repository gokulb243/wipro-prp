
public class Exercise6{
	public static void main(String[] args) 
	{
		String s=args[0];
		int age=Integer.parseInt(args[1]);
		if(s.equals("Female")&&age>1&&age<58)
			System.out.println("the percentage of interest is 8.2%");
		if(s.equals("Female")&&age>59&&age<100)
			System.out.println("the percentage of interest is 9.2%");
		if(s.equals("Male")&&age>1&&age<58)
			System.out.println("the percentage of interest is 8.4%");
		if(s.equals("Male")&&age>59&&age<100)
			System.out.println("the percentage of interest is 10.5%");
	}

}
