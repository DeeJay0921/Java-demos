
pulic class FinalDemo {
	public static void main(String[] args) {
		Animal3 a3 = new Animal3();
		// a3.num = 10; // the final fields cannot be assigned  final修饰的成员变量不可以被赋值，哪怕赋的是原值。即是常量,一般命名使用大写。
	}
}

final class Animal {
	public void eat(){
		System.out.println("eating");
	}
}

// class Dog extends Animal {} // cannot subclass the final class   final修饰的类不可以被继承

class Animal2 {
	final public void eat(){ // final修饰成员方法
		System.out.println("eating");
	}
}
class Dog2 extends Animal2 {
	// public void eat() {} // cannot Override the final method  final修饰的成员方法不可以被重写
}

class Animal3 {
	final int num = 3;
}
