package Assignment0210;

public class Person {
	
	private final String name="Pankaja";
	private final int age=24;



//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	public String toString() {

		return "Person [name=" + name + ", age=" + age + "]";

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person person=new Person("Pankaja", 24);
		Person person = new Person();
		System.out.println(person);

	}

}
