package TestPackage;

class B
{
	void Even()
	{
		System.out.println("Even no. are: ");

		int i=1;
		while(i<=10)		
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}

		}
	
	void Odd()
	{
		System.out.println("Odd no. are: ");

		int i=1;
		while(i<=10)		
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}

		}
	
	
	
	
}
public class W{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B a = new B();
		a.Even();
		a.Odd();
	}

}