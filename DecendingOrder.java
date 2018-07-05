import java.util.Scanner;
class DecendingOrder
{
public static void main(String args[])
{
int count,n;
Scanner kb=new Scanner(System.in);
System.out.println("enter numbers");
 n=kb.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++)
{
      a[i]=kb.nextInt();
}

for(int i=0;i<n;i++)
{
     for(int j=i+1;j<n;j++)
               {
                 if(a[i]<a[j])
                {
                   count=a[i];
                   a[i]=a[j];
                   a[j]=count;
                }
              }
}
System.out.println("Decending order");

for(int i=0;i<n-1;i++)
{
System.out.println(a[i]+",");
}

System.out.println(a[n-1]);
}
}