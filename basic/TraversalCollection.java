import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		for(int i = 0 ; i < 10; i ++) {
			c.add(i);
		}
		// method1();
		// method2();
	}
	public void method1(Collection c) { // 使用Iterator
		Iterator it = c.iterator(); // 返回一个迭代器对象
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void method2(Collection c) { // 使用toArray()
		Object[] objArr = c.toArray();
		for(int i = 0 ; i < objArr.length; i ++) {
			System.out.println(objArr[i]);
		}
	}
}
