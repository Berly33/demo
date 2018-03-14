

public class MyLink {

	private static Object tmp;

	public static void main(String[] args)  {

		LinkList L = new LinkList();
		System.out.println("单链表创建");
		L.creat();
		System.out.print("创建的单链表为:");
		L.showList();

		System.out.println("单链表的长度为:"+L.length());

		L.insert(3, 100);
		System.out.print("插入后的线性表为:");
		L.showList();

		tmp = L.remove(4);
		System.out.print("删除后的线性表为:");
		L.showList();
		System.out.println("删除的元素为:"+tmp);

		int a=L.search(100);
		System.out.println("查找元素100在表中的位置为:"+a);

		Integer b=(Integer)L.getElement(5);
		System.out.println("查找第5个位置的元素为:"+b);
	}
}