// 匿名内部类
public class InnerClass4 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method(); // Inner Function
    }
}

interface Inner { // 创建一个接口或者类
	public abstract void func();
}

class Outer {
    public void method() {
		new Inner() { // 定义内部类
			@Override
			public void func() {
				System.out.println("Inner Function");
			}
		}.func(); // 可以直接调用方法，前面的就是一个实例对象了
		
		// 也可以这么写
		Inner i = new Inner() { // 由于实现了接口  可以向上转型
			@Override
			public void func() {
				System.out.println("Inner Function");
			}
		};
		i.func();
    }
}
