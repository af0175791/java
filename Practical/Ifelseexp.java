import java.util.Scanner;
class Ifelseexp
{public void display()
{
Scanner s= new Scanner(System.in);
System.out.println("Enter age");
int age=s.nextInt();
if(age>=18)
{
System.out.println("your are eligible");
}
else
{
System.out.println("you ar not eligible");
}
}
public static void main(String args[])
{
Ifelseexp obj= new Ifelseexp ();
obj.display(); 
}
}