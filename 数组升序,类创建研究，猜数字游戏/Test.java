
//研究类创建使用
class Lined
	{
		//int a;
		//int b;

		static int sum(int a,int b)
		{
			return a+b;
		}
	}


public class Test {
	public static void main(String[] args) {
		int A=3;
		int B=4;
		Lined volu = new Lined();
		//volu.a = 3;
		//volu.b = 2;
		//Lined.a = 3;
		//Lined.b = 2;
		System.out.println(Lined.sum(A,B));
	}
}