package TestPackage;

public class Calculator {

	public static void main(String[] args) {
		
Cal c1=new Cal();
c1.display();
	}

}
class Cal{
	public int a=10;
	public int b=20;
	public int addition=a+b;
	public int substraction= a-b;
	public float multiplication =a*b;
	public float division=a/b;
	public void display()
	{
		System.out.println("Addition=>"+addition);
		System.out.println("Substraction=>"+substraction);
		System.out.println("Multiplication=>"+multiplication);
		System.out.println("Division=>"+division);
	}
}