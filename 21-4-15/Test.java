 import java.util.*;
public class Test//输入n个数,输出比平均值大的数
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
		
        System.out.print("Number of numbers:");
        int n = reader.nextInt();//输入几个数
        int[] arr = new int[n];//定义存放数的数组

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=reader.nextInt();//向数组内输入数字
        }
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum+=arr[i];//数组内数字就和
        }
        sum/=arr.length;//求平均值
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=sum)//判断大于平均数的输出
                System.out.print(arr[i]+" ");
        }

    }
}
//测试如何向数组输入数
// public class Test {
//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         int[] arr = new int[5];

//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=reader.nextInt();
//         }
//         for (int e:arr) 
//         {
//             System.out.print(e+" ");
//         }
//     }
// }