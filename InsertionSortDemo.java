import java.util.Scanner;

class InsertionSortDemo
{
	public static void main(String[] args)
	{
		int i, j, temp, size;
		Scanner kb=new Scanner(System.in);
		size=kb.nextInt();

		int[] arr=new int[size];
		System.out.println("Enter the Element of array : ");
		for(i=0; i<size; i++)
		{
			arr[i]=kb.nextInt();
		}

		System.out.println("Array Element are : ");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Sorted Array is : ");
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
				else
				{
					j++;	
				}
			}
		}

		

		for(i=0; i<size; i++)
		{
			System.out.print(arr[i]);
		}
	}
}