import java.util.Scanner;

class CountString
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String s1=kb.nextLine();
		char[] ch=s1.toCharArray();
		int count=0;
		int loopcount=0;

		for(int i=0; i<ch.length; i++)
		{
			boolean flag=true;

			for(int j=0; j<i; j++)
			{
				if(ch[i]==s1.charAt(j))
				{
					flag=false;

				}
			}
			if(flag)
			{
				for(int k=0; k<s1.length(); k++)
				{
					if(ch[i]==s1.charAt(k))
					{
						count+=1;
					}
				}
				System.out.println(ch[i]+" "+" "+(count));
				count=0;
				loopcount++;
			}
		}
	}
}