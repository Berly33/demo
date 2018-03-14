
/*
 *  线性表接口
 */
public interface LinearList {
	int length();                                    //返回线性表的长度
	int search(Object x);                            //按值查找操作
	Object getElement(int i) throws Exception;       //按序号查找操作
	void insert(int i,Object x)throws Exception;     //插入操作
	Object remove(int i) throws Exception;           //删除操作
	boolean isEmpty();                               //判空表
	boolean isFull();                                //判断线性表是否已满
	void showList();                                 //遍历线性表
	void clear();                                    //清空线性表
}