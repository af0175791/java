class NumbersPattern 
{
public void ppattern(int num)
{
for(int i=0;j<=i;j++)
{
 for(int j=0;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
 NumbersPattern  p= new NumbersPattern ();
 int num=5;
 p.ppattern(num);
}
}