import java.util.Scanner;

class Print123
{
    	public static void main(String args[])
	{
		int i,j,num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of star in a row:");
		int r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{

                      num=1;

		       for(j=0; j<=i; j++)
			{
	   
  				System.out.print(num+ " ");
                                num++;
			}
                            System.out.println();
   
			

		}
	}
}