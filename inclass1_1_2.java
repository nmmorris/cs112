import java.util.Scanner;

public class inclass1_1_2
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		double radius;
		double area, circumference;
		System.out.print("Enter value for radius: ");
		radius=Input.nextDouble();
		area=3.14*radius*radius;
		circumference=2*3.14*radius;
		System.out.println("Area: " + area);
		System.out.println("Circumference: " + circumference);
	}
}