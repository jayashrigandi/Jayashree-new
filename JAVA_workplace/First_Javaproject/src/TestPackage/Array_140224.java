package TestPackage;

public class Array_140224 {

	public static void main(String[] args) {
		// declaration + initialization
				String name[] = new String[4];

				// storing elements in array
				name[0] = "Jaya";
				name[1] = "Mona";
				name[2] = "Rakhi";
				name[3] = "Dipti";

				//name[4]="Vedu";

				// how to access element from array

				name[1] = "Raksha";

				System.out.println(name[0]);
				System.out.println(name[1]);
				System.out.println(name[2]);
				System.out.println(name[3]);

				System.out.println("size of array= " + name.length);

				System.out.println("#################################################");

				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i]);
				}

				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

				// array declaration + initialization
						for (String s : name) {
					//System.out.println(s);
				
	}}}

		