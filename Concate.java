import java.util.Scanner;

class Concate
{
    	public static void main(String args[])
	{
                 int i=0,j=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string1");
		char s1 = scan.nextChar();
                char[] str1=s1.toCharArray();
                System.out.print("Enter string2");
		char s2 = scan.nextChar();
                char[] str2=s2.toCharArray();
            /*for(i=0;str1[i]!='\0';i++)
                  
                 for(j=0;str2[j]!='\0';i++,j++)
                  {
                   str1[i]=str2[j];
   
                  }*/
              while(str2[j]!='\0')
{
str1[i]=str2[j];
i++;
j++;
}
           str1[i]='\0';
          System.out.println(""+str1);

}
}