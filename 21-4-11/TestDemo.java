
public class TestDemo {
	public static void main1(String[] args) {
		System.out.println(5/2);//2
		System.out.println(5.0/2);//2.5
		System.out.println((float)5/2);//2.5
		System.out.println((float)(5/2));//2.0
	}

	public static void main2(String[] args) {
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-10%-3);//-1
	}
	//给定两个int变量,交换两个变量
	public static void main3(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		b = a^b;
		a = a^b;
		b = a^b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	//给定三个int变量,求其中最大值最小值
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 15;

		if(a>b && a>c)
		{
			System.out.println("Max = "+a);
		}else if(b>a && b>c)
		{
			System.out.println("Max = "+b);
		}else
		{
			System.out.println("Max = "+c);
		}
	}
}