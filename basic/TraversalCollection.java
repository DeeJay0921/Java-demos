import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10; i ++) {
			c.add(i);
		}
		// method1();
		//method2(c);
		method3(c);
	}

	public static void method1(Collection<Integer> c) { // 使用Iterator
		Iterator<Integer> it = c.iterator(); // 返回一个迭代器对象
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void method2(Collection<Integer> c) { // 使用toArray()
		Object[] objArr = c.toArray();
		for(int i = 0 ; i < objArr.length; i ++) {
			System.out.println(objArr[i]);
		}
	}
	
	private static void method3(Collection<Integer> c) { // 使用for each
		for(Integer i : c) {
			System.out.println(i);
		}
	}
	
}
