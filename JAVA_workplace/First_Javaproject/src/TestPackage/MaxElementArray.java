package TestPackage;

public class MaxElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 67, 87, 23, 34};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
System.out.println("Maximum number in Array is :=>" +max);
	}

}
