package LkList;
/**
*Created with Eclipse
*@Author Qi Jiabao
*@Date   2021年6月4日
*@Time   下午4:56:26
*@Description:
*   单链表
*/
public class TestDemo {
	public static void main(String[] args) {
		MyLinkedList mylist = new MyLinkedList();
		mylist.addLast(1);
		mylist.addLast(2);
		mylist.addLast(3);
		mylist.addLast(4);
		mylist.display();
		
		mylist.addFirst(0);
		mylist.display();
		
		System.out.println(mylist.contains(4));
		
		mylist.remove(3);
		mylist.display();
		
		mylist.addLast(1);
		mylist.addLast(2);
		mylist.addLast(3);
		mylist.addLast(2);
		mylist.display();
		mylist.removeAllKey(2);
		mylist.display();
		
		System.out.println(mylist.size());
		
		System.out.println("是否插入成功:"+mylist.addIndex(2, 3));
		System.out.println("是否插入成功:"+mylist.addIndex(0, -1));
		mylist.display();
		
		System.out.println("是否插入成功:"+mylist.addIndex(7,10));
		mylist.display();
		
		mylist.clear();
		mylist.display();
	}
}
