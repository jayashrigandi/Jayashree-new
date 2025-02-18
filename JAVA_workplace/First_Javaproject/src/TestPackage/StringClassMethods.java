package TestPackage;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to codemind";

		// Returns the char value at the specified index
		char c = s.charAt(18);
		System.out.println(c);

		// Concatenates the specified string to the end of this string.
		String concatedString = s.concat("Pune");
		System.out.println(concatedString);

		// Returns true if and only if this string contains the specified sequence of
		// char values.
		boolean b = s.contains("code");
		System.out.println(b);

		// Tests if this string ends with the specified suffix.
		boolean bb = s.endsWith("codemind");
		System.out.println(bb);

		String sss = "codemind technology";

		System.out.println(sss.compareTo("codemind technology"));
		System.out.println(sss.compareTo("codemind Technology"));

		// String s = "Welcome to codemind";
		System.out.println(s.compareToIgnoreCase("welcome to codemind"));
		System.out.println(s.compareTo("this is java programming language"));
		System.out.println(s.equals("Welcome to pune"));
		System.out.println(s.equals("Welcome to codemind"));
		System.out.println(s.equalsIgnoreCase("Welcome To Codemind"));

		// if given String is empty it will return true else it will return false
		String e = "";
		System.out.println(e.isEmpty());

		// String s = "Welcome to codemind";

		// it will return the length(character count) of given String.
		System.out.println(s.length());

		System.out.println(s.length() - 1);

		float f = 10.5f;
		System.out.println(String.valueOf(f).length());// "10.5"
		String s4 = "    welcome to    ";
		System.out.println(s4);
		System.out.println(s4.trim());

		// it will convert given String to upper case letters
		System.out.println(s.toUpperCase());

		// it will convert given String to lower case letters
		System.out.println(s.toLowerCase());

		
		// it will convert your String to char type array
		char array[] = s.toCharArray();

		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println(s.substring(3));
		
		System.out.println(s.substring(3, 10));

	}


	}

