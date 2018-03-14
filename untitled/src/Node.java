
/*
 * 单链表结点类
 */
public class Node {
	private Object data;        //数据域
	private Node next;          //地址域
	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}
	public Node(Object data) {
		this(data, null);
	}
	public Node() {
		this(null, null);
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}