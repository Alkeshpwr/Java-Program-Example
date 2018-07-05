import java.util.*;
public class Anagram2
{
	public static int isAnagram(String n1,String n2)
	{
 		String str1=n1.replaceAll("\\s","");
 		String str2=n2.replaceAll("\\s","");
		boolean status=true;
		if(str1.length()!=str2.length())
		{
			status=false;	
		}
		else
		{ 
			char[] arr1=str1.toLowerCase().toCharArray();
			char[] arr2=str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			status=Arrays.equals(arr1,arr2);
		}
		if(status)
		{
			System.out.print("1") ;
			
		}
		else
		{

			System.out.print("-1") ;
		}
		
return 1;
	}

	public static void main(String[] args)
	{
		Scanner kb1=new Scanner(System.in);
		Scanner kb2=new Scanner(System.in);
		System.out.println("enter two string");
		String name=kb1.nextLine();
		String name1=kb2.nextLine();
		isAnagram(name,name1);
	}
}