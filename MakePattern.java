 import java.util.Scanner;

public class MakePattern {
public static void square(int n)
{

for(int i=1;i<=n;i++)
{
System.out.print(i);
if(i!=n)
System.out.print("*");
}
System.out.println();
int k=2*n+1;
for(int i=3;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(k);
if(j!=n)
System.out.print("*");
k++;
}
System.out.println();
}
 k=n+1;
for(int i=1;i<=n;i++)
{
System.out.print(k);
if(i!=n)
System.out.print("*");
k++;
}
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
square(n);
}
}
