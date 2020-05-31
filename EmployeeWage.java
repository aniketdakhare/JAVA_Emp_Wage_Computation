import java.util.Random;

public class EmployeeWage
{
	static final int FULLTIME=1;
	static final int PARTTIME=2;
	static final int WAGE_PER_HOUR=20;
	static final int WORKING_DAYS=20;
	static final int MAX_HOURS=100;
	void salary()
	{
		int daily_hours=0, totalEmpHours=0, totalWorkingDays=0;
		Random r = new Random();
		while (totalEmpHours < MAX_HOURS && totalWorkingDays < WORKING_DAYS )
		{
			totalWorkingDays++;
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
					daily_hours=0;
			}
			totalEmpHours+=daily_hours;
		}
		int empWageperMonth=totalEmpHours*WAGE_PER_HOUR;
		System.out.println("Monthly salary of an employee is Rs. "+empWageperMonth);
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage emp=new EmployeeWage();
		emp.salary();
	}
}
