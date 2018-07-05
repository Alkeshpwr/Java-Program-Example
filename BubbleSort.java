class BubbleSort
{
	public static void main(String[] args)
	{
		int Arr[]={12,3,1,7,8,1,6,12,44,9};
		int Round, i, Temp;

		for(Round=1; Round< Arr.length; Round++)
		{
			for(i=0; i< Arr.length-1; i++)
			{
				if(Arr[i] > Arr[i+1])
				{
					Temp=Arr[i];
					Arr[i]=Arr[i+1];
					Arr[i+1]=Temp;
				}
			}
		}
		System.out.println("Bubble SOrting DOne");

		for(i=0; i< Arr.length; i++)
		{
			System.out.println(Arr[i]+" ");
		}
	}
}