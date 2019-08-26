import java.util.Scanner;

public class inclass1_1_4
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		double celsius_degree;
		double fahrenheit_degree;
		System.out.print("Enter a degree in Celsius: ");
		celsius_degree=Input.nextDouble();
		fahrenheit_degree=9.0*celsius_degree/5.0+32;
		System.out.println("Degree in Fahrenheit: " + fahrenheit_degree);
	}
}