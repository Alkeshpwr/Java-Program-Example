class LinearSearchDemo1
{
	public static void main(String[] args)
	{
		int i;
		int arr[]={2,5,7,9,12,35,5,15,5, 5, 5,5 ,5 };
		
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]==5)
			{
				System.out.println(arr[i]+" "+i);
			}
		}
	}
}