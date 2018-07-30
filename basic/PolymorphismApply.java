package com.polymorphism;

public class PolymorphismApply {
	public static void main(String[] args) {
		Factory2 f2 = new Factory2();
		f2.createPhone(new MiPhone2());
		f2.createPhone(new MeiZuPhone2());
	}
}
class Factory2 {
	public void createPhone(Phone p) {  // 不需要每新增一个手机类就实现一次重载 
		System.out.println("create phone");
		p.call();
	}
}

interface Phone { // 创建一个公共的接口  让其他的手机类来实现这个接口   在Factory2的方法中就可以只传人实现了这个Phone 类型的变量
	public abstract void call(); 
}

class MiPhone2 implements Phone { // 实现公共接口   具体的方法在类内部进行定义
	public void call() {
		System.out.println("MI phone is calling");
	}
}

class MeiZuPhone2 implements Phone { // 实现公共接口   具体的方法在类内部进行定义
	public void call () {
		System.out.println("MeiZuPhone is calling");
	}
}
