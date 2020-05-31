import java.util.Random;

public class EmployeeWage
{
	static final int WAGE_PER_HOUR=20;
	static int daily_hours=8;
	static int perDayWage;
	static final int FULLTIME=1;
	static final int PARTTIME=2;

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		Random r = new Random();
                int check = r.nextInt(3);
                switch (check)
		{
			case FULLTIME:
				daily_hours=8;
				break;
			case PARTTIME:
				daily_hours=4;
				break;
			default:
				System.out.println("Employee is Absent");
				daily_hours=0;
		}
                perDayWage=daily_hours*WAGE_PER_HOUR;
                System.out.println("Per day salary of an employee is Rs. "+perDayWage);
	}
}
