import java.util.*;
class Cube
{
public static void main(String[] args)
{
Scanner kb=new Scanner(System.in);
int s=kb.nextInt();
for(int i=1;i<=6;i++)
{
for(int j=1;j<=6;j++)
{
for(int k=1;k<=6;k++)
{
if((i+j+k)==s)
{
System.out.println("{"+i+","+j+","+k+"}");
}
}
}
}
}
}

