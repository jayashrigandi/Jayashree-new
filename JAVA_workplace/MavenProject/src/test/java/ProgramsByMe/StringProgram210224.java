package ProgramsByMe;

public class StringProgram210224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse a given String
				String A = "Amravati";// itavarmA
				String A2 = "";
				for (int i = (A.length() - 1); i >= 0; i--) {

					A2 = A2 + A.charAt(i);

					System.out.print(A.charAt(i));
				}

				//System.out.println(A2);

			/*	// Word reverse
				// Amravati

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
*/
			}

	}

