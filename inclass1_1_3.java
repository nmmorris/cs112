import java.util.Scanner;

public class inclass1_1_3
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		double first_variable;
		double second_variable;
		double new_first_variable, new_second_variable;
		System.out.print("Enter value for first variable: ");
		first_variable=Input.nextDouble();
		new_second_variable=first_variable;
		System.out.print("Enter value for second variable: ");
		second_variable=Input.nextDouble();
		new_first_variable=second_variable;
		System.out.println("Original first variable: " + first_variable);
		System.out.println("Original second variable: " + second_variable);
		System.out.println("New first variable: " + new_first_variable);
		System.out.println("New second_variable: " + new_second_variable);
	}
}
