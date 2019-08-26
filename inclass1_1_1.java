import java.util.Scanner;

public class inclass1_1_1
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		float first_number;
		float second_number;
		float sum, difference, product, quotient, remainder;
		System.out.print("Enter value for the first number: ");
		first_number=Input.nextFloat();
		System.out.print("Enter value for the second number: ");
		second_number=Input.nextFloat();
		sum=first_number+second_number;
		difference=first_number-second_number;
		product=first_number*second_number;
		quotient=first_number/second_number;
		remainder=first_number%second_number;
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
	}
}