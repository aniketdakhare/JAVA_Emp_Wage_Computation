import java.util.Random;

public class EmployeeWage
{
	static final int WAGE_PER_HOUR=20;
	static int daily_hours=8;
	static int perDayWage;
	void attendance()
	{
		Random r = new Random();
		int check = r.nextInt(2);
		if (check == 1)
		{
			daily_hours=8;
		}
		else
		{
			System.out.println("Employee is Absent");
			daily_hours=0;
		}
		perDayWage=daily_hours*WAGE_PER_HOUR;
		System.out.println("Per day salary of an employee is Rs. "+perDayWage);
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage emp=new EmployeeWage();
		emp.attendance();
	}
}
