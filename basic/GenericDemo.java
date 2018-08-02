import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan",18);
		Person p2 = new Person("lisi",20);
		
		Collection<Person> c = new ArrayList<Person>(); // 使用泛型 表明集合中存储Person类型的对象
		c.add(p1);
		c.add(p2);
		
		Iterator<Person> it = c.iterator(); // 使用泛型  表明迭代器中的类型也是Person类
		while(it.hasNext()) {
			it.next().show(); // 注意使用了泛型之后  这边的it.next() 返回的已经是Person类的对象了  直接直接调用方法。
		}
    }
}

class Person {
	String name;
	int age;
	public void show() {
		System.out.println(name + "---" + age);
	}
}
