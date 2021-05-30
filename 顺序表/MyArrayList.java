package LIst;

import java.util.Arrays;

/**
*Created with Eclipse
*@Author Qi Jiabao
*@Date   2021年5月25日
*@Time   下午8:39:19
*@Description:
*
*/
public class MyArrayList {
	public int[] elem;//数组
	public int useSize;//有效数据个数
	
	public MyArrayList() {
		this.elem = new int[10];
		this.useSize = 0;
	}
	
	//打印顺序表
	public void display() {
		for(int i=0;i<this.useSize;i++) {
			System.out.print(this.elem[i]+" ");
		}
		System.out.println();
	}
	
	//判断链表是否满了
	private boolean isFull() {
		if(this.useSize == this.elem.length) {
			return true;
		}
		return false;
	}
	
	//检查pos 是否合法
	public  void checkPos(int pos) {
		if(pos<0||pos>this.useSize) {
			throw new RuntimeException("pos位置不合法");
		}
	}
	
	//在pos位置新增元素
	public void add(int pos,int data) {
		
		if(isFull()) {
			//扩容
			this.elem = Arrays.copyOf(this.elem, 2*this.elem.length);
		}
		this.checkPos(pos);
		//挪数据
		for(int i=this.useSize-1;i>=pos;i--) {
			this.elem[i+1] = this.elem[i];
		}
		this.elem[pos] = data;
		this.useSize++;
	}
	
	//判断是否包含某个元素
	public boolean contains(int toFind) {
		for(int i = 0;i<this.useSize;i++) {
			if(this.elem[i] == toFind) {
				return true;
			}
		}
		return false;
	}
	
    //查找某个元素对应的位置
	public int search(int toFind) {
		for(int i = 0;i<this.useSize;i++) {
			if(this.elem[i] == toFind) {
				return i;
			}
		}
		return -1;
	}
	
	//获取pos位置的元素
	public int getPos(int pos) {
		this.checkPos(pos);
		return this.elem[pos];
	}
	
	//给pos位置的元素设为value
	public void setPos(int pos,int value) {
		this.checkPos(pos);
		this.elem[pos] = value;
	}
	
	//删除第一次出现的关键字key
	public void remove(int toRemove) {
		int i = this.search(toRemove);
		if(i!=-1) {
			for(int j = i;j<this.useSize-1;j++) {
				this.elem[j] = this.elem[j+1];
			}
		}
		return;
	}
	
	//获取顺序表长度
	public int size() {
		if(this.useSize>0) {
			return this.useSize;
		}
		return 0;
	}
	
	//清空顺序表
	public void clear() {
		this.useSize = 0;
	}	
}
	
	
