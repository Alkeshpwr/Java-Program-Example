import java.util.*;
class Fact1
{
public static void main(String[] args)
{
int fact=1,r,sum=0;
Scanner kb=new Scanner(System.in);
System.out.println("enter a number");
int n=kb.nextInt();
 for(int i=1;i<=n;i++)
{
fact=fact*i;
}

System.out.println(fact);

int a=fact;
while(a!=0)
{
 r=a%10;
 sum=sum+r;
 a=a/10;
}

System.out.println(sum);
}
}

