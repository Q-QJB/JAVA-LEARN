
public class Demo
{
	//数组赋值
	public static void main(String[] args)	
	{
		int i ;
		int[] arr ;
		arr = new int[5];

		for(i=0;i<5;i++)
		{
			arr[i] = i;
		}
		for(i=arr.length-1;i>=0;i--)
		{
			System.out.print("arr["+i+"]="+arr[i]+",\t");
		}
		System.out.println("\n数组arr的长度是:"+arr.length);
	}
	//数组排序
	public static void main(String[] args)
	{
		int[] a = {13,4,22,15,13,44,26};
		int i = 0;
		int j = 0;
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{	
					a[j]=a[j]^a[i];
					a[i]=a[j]^a[i];
					a[j]=a[j]^a[i];
				}
			}
		}
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");	
	}

}
	