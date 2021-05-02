
import java.util.*;
class Menu
{
	//打印菜单
	static void menu()
	{
		System.out.println("**************************");
		System.out.println("*******1.play 0.exit******");
		System.out.println("**************************");
	}
}
class PlayGame
{
	//实现游戏
	void playGame()
	{
		Random rand = new Random();
		int n = rand.nextInt(101);
		int a ;
		while(a!=n)
		{
			System.out.print("Guess the number:");
			a= new Scanner(System.in).nextInt();
			if(a>n)
				System.out.println("Guess big!");
			else
				System.out.println("Guess small!");
		}
		System.out.println("You are right!");
	}
}
class Text
{
	//判断是否进游戏
	void textBody()
	{
		int n;
		do
		{
			Menu.menu();
			System.out.print("Please select:");
			Scanner reader = new Scanner(System.in);
			n=reader.nextInt();
			if (n==1) 
			{
				PlayGame game =new PlayGame();
				game.playGame();
			}
			if(n!=1&&n!=0)
				System.out.println("Input error, re input!");
		}while(n!=0);
		System.out.println("Exit!");
	}
}

public class Game
{
	public static void main(String[] args)
	{
		Text game = new Text();
		game.textBody();		
	}
}