import java.util.Scanner;

public class inclass1_1_3
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		double first_variable;
		double second_variable;
		double temp_first_variable, temp_second_variable;
		System.out.print("Enter value for first variable: ");
		first_variable=Input.nextDouble();
		System.out.print("Enter value for second variable: ");
		second_variable=Input.nextDouble();
		System.out.println("Original first variable: " + first_variable);
		System.out.println("Original second variable: " + second_variable);
		temp_first_variable=first_variable;
		temp_second_variable=second_variable;
		first_variable=temp_second_variable;
		second_variable=temp_first_variable;
		System.out.println("New first variable: " + first_variable);
		System.out.println("New second variable: " + second_variable);
	}
}
