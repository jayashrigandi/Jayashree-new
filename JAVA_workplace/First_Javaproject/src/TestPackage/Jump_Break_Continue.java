package TestPackage;

class JumpBreak{
	void Break()
	{
	int i=1;
	while(i<50)
	{
		if(i==20)
		{
			break;
		}
	System.out.println("Value of i: "+i);
	i++;
 }
	}

void Continue()
{
	int c =10;
	do
	{c++;
	System.out.println("...............");
		if(c==20) {
			continue;
		}
			System.out.println("Value of c:"+c);
	}
while(c<50); 
}
}

	class Jump_Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JumpBreak b=new JumpBreak();
    b.Break();
	b.Continue();
	}}