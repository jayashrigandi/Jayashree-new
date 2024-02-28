package TestPackage;
class StaticVariableExample
{
	
	int EmpNo1=101;//Non static variable;
	static int EmpNo2=102;//Static variable;
}
public class Static_Variable {
	
	public static void main(String[] args) {
		
		StaticVariableExample S1=new StaticVariableExample();
		StaticVariableExample S2=new StaticVariableExample();
		StaticVariableExample S3=new StaticVariableExample();
		
		System.out.println("Variable EmpNo1 using object S1:"+S1.EmpNo1);//101
		System.out.println("Variable EmpNo1 using object S2:"+S2.EmpNo1);//101
		System.out.println("Variable EmpNo1 using object S3:"+S3.EmpNo1);//101
		
		S1.EmpNo1=103;//Value of non static variable changed
		
		System.out.println("Variable EmpNo1 using object S1:"+S1.EmpNo1);//103
		System.out.println("Variable EmpNo1 using object S1:"+S2.EmpNo1);//101
		System.out.println("Variable EmpNo1 using object S1:"+S3.EmpNo1);//101
		
		System.out.println("Variable EmpNo2 using object S1:"+S1.EmpNo2);//102
		System.out.println("Variable EmpNo2 using object S2:"+S2.EmpNo2);//102
		System.out.println("Variable EmpNo2 using object S3:"+S3.EmpNo2);//102
		
		StaticVariableExample.EmpNo2=104;//value of static variable changed
		
		System.out.println("Variable EmpNo2 using object S1:"+S1.EmpNo2);//104
		System.out.println("Variable EmpNo2 using object S2:"+S2.EmpNo2);//104
		System.out.println("Variable EmpNo2 using object S3:"+S3.EmpNo2);//104
	
	}
	
	
	

}
