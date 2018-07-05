import java.util.Scanner;

class SortintDemo1
{
	public static void main(String[] args)
	{
		int i, j, size, temp;
		
		Scanner kb=new Scanner(System.in);
		size=kb.nextInt();
		int[] arr=new int[size];

		System.out.println("Enter the Element of Array : ");
		for(i=0; i<size; i++)
		{
			arr[i]=kb.nextInt();
		}
		
		System.out.println("Array is : ");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}	
		System.out.println("Sorted array is : ");
		
		for(i=0; i<size; i++)
		{
			for(j=0; j<size-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is done : ");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}			
	}
}