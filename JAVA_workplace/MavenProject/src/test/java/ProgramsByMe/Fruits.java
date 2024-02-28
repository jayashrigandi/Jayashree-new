package ProgramsByMe;
class Apple
{
	String a="Apple";
	public void display()
	{
		//System.out.println("From child class Apple");
		System.out.println("Helthy fruit   :"+a);
		System.out.println("");
	}
}

class Orange extends Apple{
	
    String o ="Orange";

	public void displaycolor()
	{
		//System.out.println("From child class Orange");
		
		System.out.println("Color of fruit is  "+o);
		
		System.out.println("which fruits are helthy: "+a);
		System.out.println("and "+o);
		System.out.println("");
	}
}
class healthyfruits extends Apple
{
public void show()
{
	System.out.println("Give an example of one healthy fruit!");
	System.out.println(""  +a);
	
}
}

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple a=new Apple();
		Orange o=new Orange();
		healthyfruits hf=new healthyfruits();
		hf.display();//method from parent class
		o.displaycolor();//normal method calling
		o.display(); //method from parent class
		hf.show();//method from parent class
	}

}
