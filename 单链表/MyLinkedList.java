package LkList;
/**
*Created with Eclipse
*@Author Qi Jiabao
*@Date   2021年6月4日
*@Time   下午5:50:41
*@Description:
*
*/
class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class MyLinkedList {
	public Node head;//保存单链表的头结点的引用
	
	//头插
	public void addFirst(int data) {
		Node node = new Node(data);
		if(this.head == null) {
			this.head = node;
			return;
		}
		node.next = this.head;
		head = node;
	}
	
	//尾插
	public void addLast(int data) {
		Node node = new Node(data);
		if(this.head == null) {
			head = node;
		}
		else {
			Node tail = head;
			while(tail.next!=null) {
				tail=tail.next;
			}
			tail.next = node;
		}
	}
	
	public Node searchIndex(int index) {
		Node cur = this.head;
		while(index-1!=0) {
			index--;
			cur = cur.next;
		}
		return cur;
	}
	
	//任意位置插入，第一个数据结点为0的下标
	public boolean addIndex(int index,int data) {
		int count = this.size();
		Node node = new Node(data);
		if(index>=0&&index<=count) {
			if(index == 0) {
				addFirst(data);
			}
			else if(index == count) {
				addLast(data);
			}
			else {
				Node cur = searchIndex(index);
				node.next = cur.next;
				cur.next = node;
			}
			return true;
		}
		return false;
	}
	
	//查找是否包含关键字key是否在单链表当中
	public boolean contains(int key) {
		Node cur = this.head;
		while(cur!=null) {
			if(cur.data==key) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}
	
	//删除第一次出现关键字key的结点
	public void remove(int key) {
		Node fast = this.head.next;
		Node slow = this.head;
		
		if(this.head==null) {
			return;
		}
		if(this.head.data==key) {
			this.head = this.head.next;
		}
		else {
			while(fast!=null) {
				if(fast.data==key) {
					slow.next = fast.next;
					break;
				}
				fast = fast.next;
				slow = slow.next;
			}
		}
	}
	
	//删除所有值为key的结点
	public void removeAllKey(int key) {
		Node fast = this.head.next;
		Node slow = this.head;
		
		if(this.head == null) {
			return;
		}
		if(this.head.data==key) {
			this.head = this.head.next;
		}
		else {
			while(fast!=null) {
				if(fast.data==key) {
					slow.next = fast.next;
					fast = fast.next;
				}
				else {
					fast = fast.next;
					slow = slow.next;
				}
			}
		}
	}
	
	//得到单链表长度
	public int size() {
		int count = 0;
		Node cur = this.head;
		while(cur!=null) {
			count++;
			cur = cur.next;
			
		}
			
		return count;
	}
	
	//打印单链表
	public void display() {
		Node cur = this.head;
		while(cur!=null) {
			System.out.print(cur.data+" "); 
			cur = cur.next;
		}
		System.out.println();
	}
	
	//清除单链表
	public void clear() {
		this.head = null;
	}
}
