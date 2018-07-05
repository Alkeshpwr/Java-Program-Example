import java.util.*;
public class ArrayListDemo
{
public static void main(String args[])
{
ArrayList a = new ArrayList();
a.add("r");
a.add(10);
a.add("p");
a.add(null);
System.out.println(a);
a.remove(2);
System.out.println(a);
a.add(2,"m");
System.out.println(a);
a.add("n");
System.out.println(a);
}
}