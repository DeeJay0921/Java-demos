
public class PolymorphismDemo {
    public static void main(String[] args) {
		Dad d = new Child();
		System.out.println(d.num); // 20 成员变量在继承时没有重写的概念，也没有动态绑定的概念。 所以这边的是父类的成员变量。
		d.show(); // child 成员方法运行时，指向的是子类中被重写的方法
		d.show2(); // dad static  d变量类型还是Dad型，所以调用的静态方法是Dad类的静态方法
		
		//向下转型
		Dad2 d2 = new Child2();
		Child2 c2 = (Child2)d2; // 强制的进行了类型转换  从Dad2类型到了Child2类型。 向下转型
		c2.show(); // child 向下转型了之后就可以调用子类的方法
	}
}

class Dad {
	int num = 20;
	public void show() {
		System.out.println("dad");
	}
	public static void show2() {
		System.out.println("dad static");
	}
}
class Child extends Dad {
	int num = 10;
	public void show() {
		System.out.println("child");
	}
	public static void show2() {
		System.out.println("child static");
	}
}

// 关于多态中引用类型的转换  向上转换Dad d = new Child(); 已经隐式的进行了转换，从小到大向上转换即从子类型到父类型
// 对于向下转换即从父类转到子类，一般是由于想访问子类中特有的成员才执行的，需要强制进行类型转换

class Dad2 {}
class Child2 extends Dad2{
	public void show() {
		System.out.println("child");
	}
}
