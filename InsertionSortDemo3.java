class InsertionSortDemo3
{
	public static void main(String[] args)
	{
		int i, j, temp;
		int arr[]={77,33,44,11,88};
	
		for(i=0; i<arr.length; i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}

		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}