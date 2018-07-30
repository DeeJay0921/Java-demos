public class InterfaceDemo {
    public static void main(String[] args) {
		Cat c = new Cat();
		c.eat(); // 猫吃鱼
		System.out.println(Animal.num); // 3 可以直接访问接口内部的常量
	}
}

interface Animal { // 声明接口和声明类很相似
	public static final int num = 3; // 接口内部只支持使用常量，并且默认使用public static final来修饰  当然可以直接写出int num = 3;
	public abstract void eat(); // 内部的方法默认使用public abstract修饰，同时也只允许使用public abstract修饰，也可以直接写成void eat();
}

class Cat implements Animal { // 类和接口的关系是implements
	@Override
	public void eat() { // 必须要重写接口中的所有方法
		System.out.println("猫吃鱼");
	}
}
