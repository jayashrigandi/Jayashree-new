package CodeMind_B10;

public class ArrayDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={82,2,4,10,66,55,88};
         int temp =0;
		System.out.println("All original element of array");


		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+"");
		}
			
		for(int i=0;i<num.length;i++)
		{
		for(int j=i+1;j<num.length;j++)
			{
				if(num[j]>num[i])
			{
				temp =num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		  }
		}
		System.out.println();
		
	System.out.println("Decending order of array element");
	for(int i=0;i<num.length;i++) {
		System.out.println();
		System.out.print(num[i]+"");
	}

}}