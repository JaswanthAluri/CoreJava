package Arrays;

public class ArraySort 
{
	public static void main(String[] args) 
	{
		int[] a= {9,3,5,2,7,1};
		arraySort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	static void arraySort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
	}
}