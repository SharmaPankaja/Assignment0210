package Assignment0210;
import java.util.Scanner;

abstract class GeometricShape
{
	final double PI = 3.14;
	abstract public void area();
	abstract public void perimeter();
}

class Circle extends GeometricShape
{
	Scanner sc= new Scanner(System.in);
	int r;
	
	@Override
	public void area() {
		System.out.println("Enter circle radius");
		r=sc.nextInt();
		System.out.println("Area of circle = "+(PI * r* r));
	}

	@Override
	public void perimeter() {
		
		System.out.println("Perimeter of circle = "+(2*PI*r));
	}
	
}

class Rectangle extends GeometricShape
{
	Scanner sc= new Scanner(System.in);
	int l,b;

	@Override
	public void area() {
		System.out.println("Enter length and breadth of rectangle: ");
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Area of rectangle = "+(l*b));
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of rectangle = "+2*(l+b));
	}
	
}

class Triangle extends GeometricShape
{
	Scanner sc= new Scanner(System.in);
	double a,b,c,s;
	@Override
	public void area() {
		System.out.println("Enter 3 sides of triangle: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		s=(a+b+c)/2;
		System.out.println("Area of triangle = "+Math.sqrt(s*(s-a)*(s-b)*(s-a)));
		
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of triangle = "+(a+b+c));
	}
	
}
public class TestGeometricShape {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		Triangle tri= new Triangle();
		
		System.out.println("=============================");
		circle.area();
		System.out.println("------------------------------");
		circle.perimeter();
		
		System.out.println("==============================");
		rect.area();
		System.out.println("-------------------------------");
		rect.perimeter();
		
		System.out.println("================================");
		tri.area();
		System.out.println("--------------------------------");
		tri.perimeter();

	}

}
