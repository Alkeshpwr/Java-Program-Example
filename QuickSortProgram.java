
class QuickSortProgram
{
public static int partition(int arr[], int low, int high)
{
	int pivot=arr[high];
	int i=(low-1);
	for(int j=low; j<high; i++)
	{
		if(arr[j]<=pivot)
		{
			i++;
			int temp1=arr[i];
			arr[i]=arr[j];
			arr[j]=temp1;
		}
	}
	int temp=arr[i+1];
	arr[i+1]=arr[high];
	arr[high]=temp;
	
	return i+1;
}
public static void main(String[] args)
{
	
	int arr[]={1,2,5,6,7,8,1,4};
	int low=0, high=arr.length-1;
	int pivot=arr.length;
	if(low<high)
	{
		int i=partition(arr[],low ,high);
		
	}
}
}