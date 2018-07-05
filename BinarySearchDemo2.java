class BinarySearchDemo2
{
	public static void main(String[] args)
	{
		int[] arr={1,4,6,8,9,12,34,56,78,90};
		int Search=78;

		int Lower=0, Upper=9;

		while(Lower<=Upper)
		{
			int mid=(Lower + Upper)/2;

			if(Search==arr[mid])
			{
				System.out.println("Item Found"+mid);
				return;
			}
			else if(Search>arr[mid])
			{
				Lower=mid+1;
			}
			else
			{
				Upper=mid-1;
			}
		}
		System.out.println("unsuccessful : ");
	}
}