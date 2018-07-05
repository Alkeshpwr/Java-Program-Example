import java.util.*;
class Factorial
{
public static void main(String[] args)
{
int fact=1;
Scanner kb=new Scanner(System.in);
System.out.println("enter any number");
int a=kb.nextInt();

for(int i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println(""+fact);
}
}