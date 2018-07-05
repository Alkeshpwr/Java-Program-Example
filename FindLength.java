import java.util.*;
class FindLength
{
public static void main(String[] args)
{
int count=0;
Scanner kb=new Scanner(System.in);
System.out.println("enter any string");
String str=kb.nextLine();
char[] arr=str.toCharArray();

for(int i=0;i<arr.length;i++)
{
if(arr[i]!='\0')
{
count++;
}  
}
System.out.print(""+count);
}
}