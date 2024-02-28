package CodeMind_B10;

public class SingleInheritance {

			public static void main(String args[]) {
			
		
			TwoWheeler t = new TwoWheeler();
			t.running();
			System.out.println(t.color);
			t.twoWheelerGearChangingMachnism();
		}

		String manufacturer;
		String munufacturingDate;
		String color;
		String speed;

		public void running() {

			System.out.println("Vehicles are running very fast");

		}

	}

	class TwoWheeler extends SingleInheritance {

		public void twoWheelerGearChangingMachnism() {
			System.out.println("change gear by foot");
		}

	}

	class FourWheeler extends SingleInheritance {

	}

	class BajajTwoWheelers extends TwoWheeler {

	}