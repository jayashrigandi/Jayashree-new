package TestPackage;

class DecisionMaking {
	int age=10,grade=4;
	
	void ifstatement() {
		if(age<=10&&grade<=4)
			System.out.println("Your eligible for the admission");
	}

void IfElseStatement()
{
	int age=18;
	if(age<=18)
	{
		System.out.println("You are eligible");
	}		else
			{System.out.println("You are not eligible");
	
}}
void IfElseIfstatement()
{
	float percentage=90;
	if (percentage>=90)
	{
		System.out.println("Candidate eligible for Grade A");
	}else if (percentage>=75)
	{
	System.out.println("Candidate eligible for Grade B");
	
	}else {if(percentage>=60)
	{
	System.out.println("Candidate eligible for Grade C");
	}
	}
}
void nestedIfStatement() {
	int a=50,b=70,c=90;
	
	if(a>=b) {
		System.out.println("A is the largest number");
	}
		if(a>=c) {
			System.out.println("C is the larget number");
		}else {
		if(b>=c) {
			System.out.println("B is the larget number");
		}
		 else if(c>=b) {
			System.out.println("C is the largest number");
		}
}

}
	void switchStatement() {
		char grade = 'C';

	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	   }
	}



public class DecisionMakingEx09224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionMaking dm = new DecisionMaking();
		dm.ifstatement();
		dm.IfElseStatement();
		dm.IfElseIfstatement();
		dm.nestedIfStatement();
		dm.switchStatement();
	}

	}


