package TestPackage;

class Operaters {
	
	void unaryIncrementMethod() {
		
		int a=1;
		System.out.println("Prefix Value of a : "+ ++a); // 2
		System.out.println("Postfix Value of a : "+ a++); // 2
		System.out.println("Value of a: "+ a); // 3
	}
	
	void unaryDecrementMethod() {
		int b=2;
		System.out.println("Prefix Value of b : "+ --b); // 1
		System.out.println("Postfix Value of b : "+ b--); // 1
		System.out.println("Value of b: "+ b); // 0
	}
	
	void moduloOperater() {
		int a=4,b=3,c;
		c = a%b;
		System.out.println("Reminder is: " + c);
	}
	
	void relationalOperater() {
		int a=5;
		
		if(a<10) {
			System.out.println("Value of a is less than 10");
		}
		
		if(a>5) {
			System.out.println("Value of a is greater than 5");
		}
		
		if(a<=10) {
			System.out.println("Value of a is less than or equal to 10");
		}
		
		if(a>=5) {
			System.out.println("Value of a is greater than or equal to 5");
		}
		
		if(a==5) {
			System.out.println("Value of a is equal to 5");
		}
		
		if(a!=5) {
			System.out.println("Value of a is not equal to 5");
		}
		
	}
	
	void logicalOperater() {
		int a=10;
		
		if(a<20 && a>5) {
			System.out.println("Value of a is Less than 20 AND greater than 5");
		}
		
		if(a>20 || a>5) {
			System.out.println("Value of a is Greater than 20 OR greater than 5");
		}
		
	}
	
	void ternaryOperater() {
		
		int a=10,b;
		
		b = (a<20) ? 100 : 200;
		
		System.out.println("Value of B after Ternary operater execution : " + b);
	}
	
	void assignmentOperater() {
		
		int a=10;
		
		a+=10; // a = a + 10;
		
		System.out.println("Value of a after += : " + a);
		
	}
	
	
}

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operaters op = new Operaters();
		op.unaryIncrementMethod();
		op.unaryDecrementMethod();
		op.moduloOperater();
		op.relationalOperater();
		op.logicalOperater();
		op.ternaryOperater();
		op.assignmentOperater();
	}




}

