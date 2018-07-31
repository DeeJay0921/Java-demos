// 局部内部类
public class InnerClass3 {
    public static void main(String[] args) {
        Outer o = new Outer();
		o.method(); // Inner Function
    }
}

class Outer {
    private int num = 3;
    public void method() {
		class Inner {  // 局部内部类 在方法内部定义
			public void func() {
				System.out.println("Inner Function");
			}
		}
		
		Inner i = new Inner(); // 先定义类后实例化
		i.func();
    }
}
