import java.util.Scanner;

public class Assignment1_1
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		double value;
		double temp;
		double hours, minutes, seconds;
		System.out.print("Enter a value for seconds: ");
		value=input.nextDouble();
		hours=value/3600;
		minutes = (value%3600)/60;
		seconds = (((value%3600)%60)/60)*60;
		int inthours = (int) hours;
		int intminutes = (int) minutes;
		int intseconds = (int) seconds;
		System.out.print("Hours="+inthours+"\n");
		System.out.print("Minutes="+intminutes+"\n");
		System.out.print("Seconds="+intseconds+"\n");
	}
}