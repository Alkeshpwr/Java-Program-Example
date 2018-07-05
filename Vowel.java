import java.util.Scanner;
class Vowel
{
public static void main(String []args)
{

Scanner kb=new Scanner(System.in);
System.out.println("enter a string");
String str=kb.nextLine();
char[] arr=str.toCharArray();

for(int i=0;i<arr.length;i++)
{
if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
{

}

else
{
System.out.print(""+arr[i]);
}
}
}
}