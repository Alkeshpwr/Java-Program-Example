import java.util.Scanner;

class InsertElement
{
	public static void main(String[] args)
	{
		int i, size;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		size=kb.nextInt();
		
		int[] arr= new int[size];
		for(i=0; i<size; i++)
		{
			arr[i]=kb.nextInt();
		}

		System.out.println("Array Element are : ");
		for(i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("Enter the Element and Position you want to Insert : ");
		int insert=kb.nextInt();
		int position=kb.nextInt();
		try
		{
			for(i=size; i>=position; i--)
			{
				arr[i]=arr[i-1];
			}
			arr[position]=insert;
		}
		catch(Exception e)
		{
			System.out.print("Array size is fixed");
			
		}
		System.out.println("New Array is : ");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i]);
		}
	}
}