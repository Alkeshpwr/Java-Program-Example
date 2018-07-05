import java.util.Scanner;

class Prime
{
    	public static void main(String args[])
	{
                int numbr,k,remark,n=11;
                for(numbr=2;numbr<=n;++numbr)
               {
               remark=0;
               for(k=2;k<=numbr/2;k++)
               {
               if((numbr % k) == 0)      
               {
               remark++;
               break;
               }
               }
               if(remark==0)
               System.out.println(""+numbr);
              }
    
   }
}