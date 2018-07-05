class FibbonacchiSeries
{
	public static void main(String args[])
	{
		int First=0, Second=1, temp;
		System.out.print(First+" "+Second+" ");

		for(int i=0; i<15; i++)
		{
			temp=First+Second;
			if(temp<=200)
			System.out.print(temp+" ");
			First=Second;
			Second=temp;
		}
	}
}