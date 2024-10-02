package Assignment0210;

class A
{
	static public void parent()
	{
		System.out.println("Parent");
	}
}
class B extends A
{
	static public void parent()
	{
		System.out.println("Child");
	}

	
}
public class ABClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		a.parent();
		System.out.println("==================================");
		b.parent();
		System.out.println("==================================");
		a = new B();
		a.parent();
		
	}

}
