package SetAndMapDemo;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		// 有自定义的Stu类
		Stu s1 = new Stu("Yang", 23);
		Stu s2 = new Stu("DeeJay", 22);
		Stu s3 = new Stu("DeeJay", 22);
		// 创建HashSet对象
		HashSet<Stu> hs = new HashSet<Stu>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs); // [Stu [name=Yang, age=23], Stu [name=DeeJay, age=22]]
		
		// 重写了equals() 和 hashCode() 之后    做到了自定义类的不重复添加
	}
}

class Stu {
	String name;
	int age;
	
	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 判断是否同一元素
		if (this == obj)
			return true;
		// 判断是否为null
		if (obj == null)
			return false;
		// 判断运行时类是否一直
		if (getClass() != obj.getClass())
			return false;
		Stu other = (Stu) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null) // name为String,是引用类型，有可能为null
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
