package CodeMind_B10;

public class StringProgram {
	
			public static void main(String[] args) {

			// reverse a given String
			String s = "Welcome to codemind";// 
			String s2 = "";
			for (int i = (s.length() - 1); i >= 0; i--) {

				s2 = s2 + s.charAt(i);

				// System.out.print(s.charAt(i));
			}

			System.out.println(s2);

			// Word reverse
			// emocleW ot dnimedoc

			String array[] = s.split(" ");
			String s4 = "";
			for (String s3 : array) {

				for (int i = (s3.length() - 1); i >= 0; i--) {

					s4 = s4 + s3.charAt(i);
				}
				s4 = s4 + " ";

			}

			System.out.println(s4.trim());

			// find only digits and do addition of digits
			String s5 = "assd1233";// 9

			String s6 = s5.replaceAll("[^0-9]", "");
			int add = 0;
			for (int i = 0; i < s6.length(); i++) {
				int num = Character.getNumericValue(s6.charAt(i));
				add = add + num;
			}

			System.out.println(add);

		}

	}
