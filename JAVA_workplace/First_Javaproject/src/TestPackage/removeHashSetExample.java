package TestPackage;

import java.util.HashSet;

public class removeHashSetExample {

	public static void main(String[] args) {
		
				HashSet<String> set=new HashSet<>();
				set.add("Jaya");
				set.add("Medhu");
				set.add("Junnu");
				System.out.println("Name of the kids are="+set);
				set.remove("Jaya");
				System.out.println("Updated Hashset names are = "+set);
			}
				
}


