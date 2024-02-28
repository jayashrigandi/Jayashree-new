package TestPackage;
import java.util.HashSet;


public class removeAllHashsetExample {

	public static void main(String[] args) {
	HashSet<String> hashset = new HashSet<>();
	
	hashset.add("Amravati");
	hashset.add("Nagpur");hashset.add("Pune");
	hashset.add("Mumbai");hashset.add("Nashik");
	
	System.out.println("Name of the cities before removal="+hashset);
	removeAllname(hashset);
	System.out.println("Updated Hashset names are = "+hashset);
	
}

	private static void removeAllname(HashSet<String> set) {
		set.clear();
		
	}
	

}
