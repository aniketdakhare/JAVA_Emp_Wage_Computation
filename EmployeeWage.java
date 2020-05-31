import java.util.Random;

public class EmployeeWage
{

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		Random r = new Random();
		int check = r.nextInt(2);
		if (check == 1)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}

}
