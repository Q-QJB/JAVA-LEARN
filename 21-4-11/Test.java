public class Test {

	/**
	讲解长整形
	*/
	public static void main1(String[] args) {
		/*
		1、long长整形 8个字节
		2、定义长整形 long a = 10L;不加L不是长整形
		3、取值范围:-2^63~2^62-1
		*/
		long a = 10L;

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(a);

		int b = 10;
		int c = 20;
		System.out.println(b+c);
		//注意:任何类型数据 和 字符串进行拼接 结果就是字符串
		System.out.println("hhh"+b+c);
	}


	/**
	String[] args 代表的是什么
	*/
	public static void main2(String[] args) {
		//String[] args 运行时命令行参数
		for (int i = 0;i <args.length ;i++ ) {
			System.out.println(args[i]);
		}
		System.out.println("kaixin");
	}

	/**
	双精度浮点型
	*/
	public static void main3(String[] args) {
		double d = 12.5;//12.5 默认双精度类型
		//double 占8个字节
		System.out.println(d);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
	}

	/**
	单精度 float
	*/
	public static void main4(String[] args) {
		float f = 12.3F;
		//java当中不允许把double类型值 直接赋值给float
		//编译错误,float需在值后面加F
		System.out.println(f);
	}

	/**
	字符数据类型
	char 占2个字节
	取值 0~65535
	Unicode字符集-->它包含了很多
	*/
	public static void main5(String[] args) {
		char ch = 'a';
		System.out.println(ch);

		char ch2 = '高';
		System.out.println(ch2);
	}
	/**
	字节: byte 占1个字节
	取值:-128~127
	*/
	public static void main6(String[] args) {
		byte b = 12;
		byte c = 21;
		System.out.println(b+" "+c);
	}

	/**
	短整型:short 占2个字节 32767~-32768
	*/
	public static void main7(String[] args) {
		short sh = 12;
		System.out.println(sh);

	}

	/**
	布尔类型:
	1、在java当中 布尔类型 没有明确的大小
	2、在java当中 布尔类型 只有两个取值 true和false
	3、在java当中 没有0假 非零真 只有真true 假false
	*/
	public static void main8(String[] args) {
		boolean flg = false;
		System.out.println(flg);
	}

	/**
	字符串数据类型:String
	转义字符\
	*/
	public static void main9(String[] args) {
		String str = "\"hello\"";
		System.out.println(str);
	}

	/**
	int 和 String 之间的相互转换
	*/
	public static void main(String[] args) {
	//int 转 String
		/*int num = 10;
		//方法一
		String str1 = num + "";
		//方法二
		String str2 = String.valueOf(num);*/
	//String 转 int
		String str = "100";
		int num = Integer.parseInt(str);
		System.out.println(num);

	}
	
}