import java.util.*;
class Reverse
{
public static void main(String[] args)
{
Scanner kb=new Scanner(System.in);
System.out.println("enter a string");
String str= kb.nextLine();
char[] arr=str.toCharArray();
String reverse="";
for(int i=0;i<arr.length;i++)
{
reverse=arr[i]+reverse;
}
System.out.print(""+reverse);
}
}