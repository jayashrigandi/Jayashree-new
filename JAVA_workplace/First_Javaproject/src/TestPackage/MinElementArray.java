package TestPackage;

public class MinElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {50, 67, 87, 23, 34};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
System.out.println("Maximum number in Array is :=>" +min);
	}

}

	

