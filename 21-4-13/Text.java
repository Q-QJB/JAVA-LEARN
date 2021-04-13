import java.util. * ;

public class Text {
	//计算斐波那契序列前16项
	public static void main1(String[] args) {
		final int MAX = 15;
		int i = 0, j = 1, k = 1;
		while(k<=MAX)
		{
			System.out.print(" "+i+" "+j);
			i = i + j;
			j = i + j;
			k = k + 2;
		}
		System.out.println();
	}


	//从键盘上输入一个整数n,计算1+2+...+n
	public static void main2(String[] args) {
		int n = 0;
		int sum = 0;
		System.out.print("输入1个数:");
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		do
		{
			sum += n;
			n--;
		}while(n>0);
		System.out.println("1+2+...+"+n+"="+sum);
	}

	//
	public static void main(String[] args) {
		int m ;
		Scanner reader = new Scanner(System.in);
		m = reader.nextInt();
		int n = 1;
		int s = 1;
		
		do
		{
			s*=n;
			n++;
		} while(s<m);
		System.out.println("s="+s/(n-1));
		System.out.println("n="+(n-2));
	}
//
	// public static void main(String[] args) {
	// 	final int MAX = 10;
	// 	int i;
	// 	int sum;
	// 	for(i=1;i<=MAX;i++)
	// 	{
	// 		sum+=i;
	// 	}
	
	// 	System.out.println(sum);
	//}
}