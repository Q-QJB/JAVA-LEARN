package LIst;

import LIst.MyArrayList;

/**
*Created with Eclipse
*@Author Qi Jiabao
*@Date   2021年5月25日
*@Time   下午8:38:48
*@Description:
*
*/
public class TestDemo {
	public static void main(String[] args) {
		MyArrayList myArrayList1 = new MyArrayList();//实例化一个顺序表对象
//		myArrayList1.add(0, 1);
//		myArrayList1.add(1, 2);
//		myArrayList1.add(2, 3);
//		myArrayList1.add(3, 4);
//		myArrayList1.display();
		
		//向数组内插入数据
		for(int i = 0; i<10;i++) {
			myArrayList1.add(i, i);
		}
		myArrayList1.display();//打印顺序表
		
		//检测顺序表是否包含元素3
		System.out.println(myArrayList1.contains(3));
		
		//查找元素3的下标
		int a = myArrayList1.search(3);
		if(a<0) {
		System.out.println("没找到");
		}
		else {
		System.out.println("找到了,下标是:"+a);
		}
		
		//获取下标为4的元素
		System.out.println(myArrayList1.getPos(4));
		
		//将下标为2的元素换为11
		myArrayList1.setPos(2,11);
		myArrayList1.display();
		
		//将第一个为11的元素删除
		myArrayList1.remove(11);
		myArrayList1.display();
		
		//打印顺序表长度
		System.out.println("该顺序表长度为:"+myArrayList1.size());
			
		myArrayList1.clear();
		myArrayList1.display();
	}
}
