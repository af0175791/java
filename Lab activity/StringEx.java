public class StringEx
{
	public static void show()
	{
		String s="Welcome to Java World";
		String s1="Welcome";
		String s3="HELLO";
		System.out.println("Character at 5th position:" + s.charAt(5));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s1+" Let us learn");
		System.out.println(s.indexOf('a'));
		System.out.println("Replace String:" + s.replaceAll(" a ", " e "));
		System.out.println(s.substring(4, 10));
		System.out.println(s3.toLowerCase());
		
	}

	public static void main(String[] args) 
	{
		
        show();
		
	}

}
