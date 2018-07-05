import java.util.*;

class CollectionsSortDemo
{
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		
		l.add("Alkesh");
		l.add("zoha");
		l.add("hemant");
		l.add("rahul");
		l.add("aadil");

		System.out.println("before sorting : "+l);
		
		Collections.sort(l, new MyComparator());
		System.out.println("after Sorting : "+l);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
	
		return s2.compareTo(s1);
	}
}