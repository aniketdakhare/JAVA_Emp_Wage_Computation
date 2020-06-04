import java.util.Random;

public class EmployeeWage
{
	public static final int FULLTIME=1;
	public static final int PARTTIME=2;

	private int numofCompany=0;
	private CompanyEmployeeWage[] empWageArray;

	public EmployeeWage()
	{
		empWageArray=new CompanyEmployeeWage[5];
	}

	private void addCompanyEmpWage(String company, int wage_per_hour, int working_days, int max_hour)
	{
		empWageArray[numofCompany]=new CompanyEmployeeWage(company, wage_per_hour, working_days, max_hour);
		numofCompany++;
	}

	private void computeEmpWage()
	{
		for (int i = 0; i < numofCompany; i++)
		{
			empWageArray[i].setEmpWageperMonth(this.computeEmpWage(empWageArray[i]));
			System.out.println(empWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmployeeWage companyEmployeeWage)
	{
		int daily_hours=0, totalEmpHours=0, totalWorkingDays=0;
		Random r = new Random();
		while (totalEmpHours < companyEmployeeWage.MAX_HOURS && totalWorkingDays < companyEmployeeWage.WORKING_DAYS )
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
		return totalEmpHours*companyEmployeeWage.WAGE_PER_HOUR;
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage emp=new EmployeeWage();
		emp.addCompanyEmpWage("Relience Fresh",25,20,96);
		emp.addCompanyEmpWage("Dmart",20,22,104);
		emp.computeEmpWage();
	}
}

