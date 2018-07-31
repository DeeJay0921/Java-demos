// 成员内部类 private static 修饰
public class InnerClass2 {
    public static void main(String[] args) {
		 // Outer.Inner i = new Outer().new Inner(); //  由于Inner被private修饰 提示Outer.Inner不可见
		 Outer.Inner2 i = new Outer.Inner2(); // 由于Inner被static修饰  所以不用创建Outer的实例  直接new Outer.Inner2()就可以创建这个实例了
    }
}

class Outer {
    private int num = 3;
    public void method() {
        Inner i = new Inner();
        i.func();
    }
    private class Inner {  // 使用private修饰了成员内部类之后  外部不可见
        public void func() {
            System.out.println("Inner Function");
            System.out.println(num);
        }
    }
	
	static class Inner2 {  // 使用static修饰了成员内部类之后  创建对象就不用创建Outer类的实例了。
        public void func() {
            System.out.println("Inner Function");
            System.out.println(num);
        }
    }
}
