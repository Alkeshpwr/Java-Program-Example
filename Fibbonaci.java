import java.util.Scanner;
class Fibbonaci
{
public static void main(String args[])
{   
      int n1=0,n2=1,n3;
   Scanner kb=new Scanner(System.in);
      System.out.println("enter any number:");
   int n=kb.nextInt();
        System.out.println(n1+"  "+n2);
      for(int i=2;i<n;i++)
{
    n3=n1+n2;
System.out.println(" "+n3);
    n1=n2;
    n2=n3;
}


}
}

      
