import java.util.Scanner;

public class Prime1
{
    	public static void p(int n)
    	{
                	for(int numbr=2;numbr<=n;++numbr)
               		{
             		 	int  remark=0;
               			for(int k=2;k<=numbr/2;k++)
               			{
               				if((numbr % k) == 0)      
               				{
               					remark++;
					break;
               				}
  			}
			if(remark==0)
			{
				System.out.print(numbr);
				if(numbr<n)
					System.out.print(",");
			}
           		}
   	}
	public static void main(String args[])
 	{ 
   	 	Scanner kb =new Scanner(System.in);
    		int n=kb.nextInt();
    		p(n);
 	}
}