package Assignment0210;
abstract class Animal
{
	
	abstract public void sound();
	abstract public void move();
}
class Dog extends Animal
{

	@Override
	public void sound() {
		System.out.println("The Dog Barks........");
	}

	@Override
	public void move() {
		System.out.println("Dog is running.......");
	}
	
}
class Cat extends Animal
{

	@Override
	public void sound() {
		System.out.println("The Cat Mews........");
	}

	@Override
	public void move() {
		System.out.println("Cat is walking.......");
	}
	
}
class Bird extends Animal
{

	@Override
	public void sound() {
		System.out.println("The Birds Chirp........");
	}

	@Override
	public void move() {
		System.out.println("The Birds fly.......");
	}
	
}

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird birds = new Bird();
		dog.sound();
		dog.move();
		System.out.println("===========================================");
		cat.sound();
		cat.move();
		System.out.println("===========================================");
		birds.sound();
		birds.move();

	}

}
