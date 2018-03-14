
import java.util.Scanner;
/*
 *  带头结点的单链表
 */
public class LinkList implements LinearList {
    private Node head;// 头指针

    // 构造方法
    public LinkList() {
        head = new Node();
    }
    //尾插法创建单链表
    public void creat(){
        Node p=head;
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入单链表的长度：");
        n=in.nextInt();
        System.out.println("请输入数据元素：");
        for(int i=0;i<n;i++){
            Node s=new Node(in.nextInt());
            s.setNext(p.getNext());
            p.setNext(s);
            p=s;
        }
    }
    // 返回单链表的长度
    public int length() {
        Node p = head.getNext();
        int length = 0;
        while (p != null) {
            length++;
            p = p.getNext();
        }
        return length;
    }
    // 按值查找操作
    public int search(Object x) {
        Node p = head.getNext();
        int k = 1;
        while (p != null ) {
            if(p.getData().equals(x)==false){
                p = p.getNext();
                k++;
            }
            else
                break;
        }
        if (p != null)
            return k;
        else
            return -1;
    }

    // 按序号查找（取单链表的第i个数据元素）
    public Object getElement(int i)  {
        Node p = head.getNext();
        int k = 1;
        while (p != null && k < i) {
            p = p.getNext();
            k++;
        }
        if (p == null || k > i) {
            System.out.println("单链表中不存在第" + i + "个数据元素");
        }
        return p.getData();
    }

    // 插入一个新元素x到单链表的第i个位置上
    public void insert(int i, Object x)  {
        Node p = head;
        int k = 0;
        while (p != null && k < i - 1) {
            p = p.getNext();
            k++;
        }               //p指向了第i-1个节点，此时k=i-1
        if (k > i - 1 || p == null)
            System.out.println("插入位置非法");
        Node s = new Node(x);
        s.setNext(p.getNext());
        p.setNext(s);
    }

    // 删除单链表中的第i个数据元素
    public Object remove(int i)  {
        Node p = head;
        int k = 0;
        while (p.getNext() != null && k < i - 1) {
            p = p.getNext();
            k++;
        }                //p指向了第i-1个节点，此时k=i-1
        if (k > i - 1 || p.getNext() == null)
            System.out.println("删除位置非法");
        Object tmp = p.getNext().getData();
        p.setNext(p.getNext().getNext());
        return tmp;
    }

    // 判断单链表是否为空
    public boolean isEmpty() {
        return head.getNext() == null;
    }
    // 判断单链表是否已满
    public boolean isFull() {
        return false;
    }
    // 遍历显示单链表中的所有数据元素
    public void showList() {
        Node p = head.getNext();
        while (p != null) {
            System.out.print(p.getData() + " ");
            p = p.getNext();
        }
        System.out.println();
    }
    // 清空单链表
    public void clear() {
        head.setData(null);
        head.setNext(null);
    }
}