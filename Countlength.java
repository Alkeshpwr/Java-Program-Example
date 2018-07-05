import java.util.Scanner;
class Countlength
{
public static void main(String args[])
{
Scanner kb=new Scanner(System.in);
System.out.println("enter a string");
String n=kb.nextLine();
 int count=0;
char[] arr=n.toCharArray();


for(int i=0;i<arr.length;i++)
{
if(arr[i]!='\0')
{
count++;
}
}
System.out.println("the length of string is"+count);
}
}
