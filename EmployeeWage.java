import java.util.Random;

public class EmployeeWage
{
	public static final int FULLTIME=1;
	public static final int PARTTIME=2;

	private final int WAGE_PER_HOUR;
	private final int WORKING_DAYS;
	private final int MAX_HOURS;
	private final String COMPANY;
	private int empWageperMonth;

	public EmployeeWage(String company, int wage_per_hour, int working_days, int max_hour)
	{
		this.WAGE_PER_HOUR=wage_per_hour;
		this.WORKING_DAYS=working_days;
		this.MAX_HOURS=max_hour;
		this.COMPANY=company;
	}

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
		empWageperMonth=totalEmpHours*WAGE_PER_HOUR;
        	System.out.println("Monthly Employee wage of "+COMPANY+" is Rs. "+empWageperMonth);
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage Dmart=new EmployeeWage("Dmart",20,22,104);
		EmployeeWage Relience=new EmployeeWage("Relience Fresh",25,20,96);
		Dmart.salary();
		Relience.salary();
	}
}
