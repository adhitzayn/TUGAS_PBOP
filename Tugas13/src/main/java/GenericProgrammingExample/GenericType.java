package GenericProgrammingExample;

public class GenericType<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}

	public static void main(String args[]) {
		
		// Generic type with Integer Type
		GenericType<Integer> type = new GenericType<>();
		type.set(50); // valid
		System.out.println(type.get());
		
		// Generic type with String Type
		GenericType<String> typeStr = new GenericType<>();
		typeStr.set("String");
		System.out.println(typeStr.get());
		
		// Generic type with Custom Student Type
		GenericType<Student> genericType = new GenericType<>();
		Student student = new Student();
		student.setName("Adhitia Zain Nurrizki");
		genericType.set(student);
		System.out.println(genericType.get());
		
		
		@SuppressWarnings("rawtypes")
		GenericType type1 = new GenericType(); // raw type
		type1.set("Adhitia Zain Nurrizki"); // valid
		type1.set(10); // valid and autoboxing support
		System.out.println("Raw Type :" + type1.get());
	}
}

class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
