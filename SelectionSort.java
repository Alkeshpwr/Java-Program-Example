import java.util.Scanner;

class SelectionSort
{
	public static void main(String[] args)
	{
		int i,j,temp;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=kb.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the Element : ");
		
		for(i=0; i<size; i++)
		{
			arr[i]=kb.nextInt();
		}
		
		System.out.println("Sorted Array are : ");
		for (i = 0; i < size -1; i++)
   		{
      			int min = i;
      			for (j = i+1; j < size; j++)
			{
            				if (arr[j] < arr[min])
				{ 
					min = j;
      				}
	}
				temp = arr[i];
      				arr[i] = arr[min];
      				arr[min] = temp;
			
		}

		for(i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}