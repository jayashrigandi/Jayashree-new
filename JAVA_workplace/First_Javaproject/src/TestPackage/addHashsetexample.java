package TestPackage;
import java.util.HashSet;
import java.util.Iterator;
public class addHashsetexample {

	public static void main(String[] args) {
		HashSet<Integer>hashSet=new HashSet<>();
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(50);
		System.out.println("Element in HashSet=");
		Iterator<Integer>iterator =hashSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
