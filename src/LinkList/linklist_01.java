package LinkList;

import java.util.LinkedList;

public class linklist_01 {
	public Node head;
	public Node current;
		 
	//方法：向链表中添加数据
	public void add(int data) {
	//判断链表为空的时候
	if (head == null) {  //如果头结点为空，说明这个链表还没有创建，那就把新的结点赋给头结点
		head = new Node(data);
		current = head; 
	} else { 
		//创建新的结点，放在当前节点的后面（把新的结点合链表进行关联）
		current.next = new Node(data);
		//把链表的当前索引向后移动一位
		current = current.next; //此步操作完成之后，current结点指向新添加的那个结点 
		}
	}
		 
	//方法：遍历链表（打印输出链表。方法的参数表示从节点node开始进行遍历
	public void print(Node node) { 
		if (node == null) { 
			return;
		}
		 
		current = node;
		while (current != null) {
		System.out.print(current.data + " --> ");
		current = current.next;
		}
		System.out.println();
	} 
		 
		class Node {
		//注：此处的两个成员变量权限不能为private，因为private的权限是仅对本类访问。
		  int data; //数据域
		  Node next;//指针域
		 
		  public Node(int data) { 
			  this.data = data;
		  }
		}
		 
		 
		public static void main(String[] args) { 
			linklist_01 list = new linklist_01(); 
			//向LinkList中添加数据 
			for (int i = 0; i < 10; i++) { 
				list.add(i); 
			}

			list.print(list.head);// 从head节点开始遍历输出
			//System.out.println("-----Reverse List------");
			//list.print(reverseList(list.head));
			System.out.println("-----Reverse Print------");
			reversePrint(list.head);
			
		}
		
		//方法：链表的反转
		public static Node reverseList(Node head) { 
			//如果链表为空或者只有一个节点，无需反转，直接返回原链表的头结点 
			if (head == null || head.next == null) { 
				return head; 
			}

			Node current = head;
			Node next = null; //定义当前结点的下一个结点 
			Node reverseHead = null; //反转后新链表的表头
			while (current != null) { 
				next = current.next; //暂时保存住当前结点的下一个结点，因为下一次要用 
				current.next = reverseHead; //将current的下一个结点指向新链表的头结点
				reverseHead = current; 

				current = next; // 操作结束后，current节点后移 
				} 
			return reverseHead; 
			}
		public static void reversePrint(Node head) { 
			if (head == null) { 
				return;
			}
			reversePrint(head.next);
			System.out.print(head.data + " --> ");
		}
}
