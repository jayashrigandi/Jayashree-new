package TestPackage;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multi[][] = new int[2][3];
		//
//				multi[0][0] = 10;
//				multi[0][1] = 20;
//				multi[0][2] = 30;
		//
//				multi[1][0] = 40;
//				multi[1][1] = 40;
//				multi[1][2] = 80;

				int multi1[][] = { { 10, 20, 30 }, { 40, 40, 80 }, { 2, 4, 60 } };

				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

				// this is used to get length of or number of rows
				System.out.println("rows= " + multi1.length);

				// this is used to get number of columns from specific index row
				System.out.println("1 rows columns = " + multi1[1].length);

				// changing value of index
				multi1[1][1] = 90;

				// accessing value by using index
				System.out.println(multi1[1][2]);

				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

				// printing by using for loop
				for (int i = 0; i < multi1.length; i++) {
					for (int j = 0; j < multi1[i].length; j++) {
						System.out.print(multi1[i][j] + "\t");
					}

					System.out.println();
				}

			}

		

	}


