// 成员内部类 使用
public class InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method(); // Inner Function  3  
		
		// 如果想直接在外部调用Inner的对象调用方法的话  可以直接import 包名.Outer.Inner
		// 也可以直接写类的全名来创建对象
		Outer.Inner i = new Outer().new Inner();
		i.func(); // 这样就可以直接创建Inner的对象了
	}
}

class Outer {
	private int num = 3;
	public void method() {
		Inner i = new Inner();
		i.func();
	}
	class Inner { // 在类的内部定义的类  成员内部类  可以访问Outer类中的成员
		public void func() {
			System.out.println("Inner Function");
			System.out.println(num);
		}
	}
}
