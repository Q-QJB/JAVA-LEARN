import java.util.*;
public class Test1
{
    public static void main1(String[] args)//求三阶方阵对角线上个元素之和
    {
        int[][] arr = {{1,1,1},{2,2,2},{3,3,3}};
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0;i<arr.length;i++)
		{
				sum1+=arr[i][i];
		}
		for(int i = arr.length-1;i>=0;i--)
		{
				sum2+=arr[i][i];
        }
		System.out.println("反对角线元素和是"+sum1);
		System.out.println("正对角线元素和是"+sum2);
    }

    public static void main(String[] args) {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Number of numbers");
    	int n = reader.nextInt();//输入想要输入数个数

    	int[]arr = new int[n];//申请数组空间,并输入
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i] = reader.nextInt();
    	}

    	int max=arr[0];
    	int min=arr[0];
    	for(int i=1;i<arr.length;i++)//比较出最大值最小值分别赋给max,min
    	{
    		if(arr[i]>max)
    			max=arr[i];
    	}
    	for(int i=1;i<arr.length;i++)
    	{
    		if(arr[i]<min)
    			min=arr[i];
    	}

    	System.out.println("max="+max);//输出
    	System.out.println("min="+min);
    }
}