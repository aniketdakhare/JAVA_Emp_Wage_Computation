import java.util.*;

public class EmployeeWage implements EmpWageInterface
{
	public static final int FULLTIME=1;
	public static final int PARTTIME=2;

	private LinkedList<CompanyEmployeeWage> empWageList;
	private Map<String, CompanyEmployeeWage> companyToEmoWageMap;

	public EmployeeWage()
	{
		empWageList=new LinkedList<CompanyEmployeeWage>();
		companyToEmoWageMap = new HashMap<String, CompanyEmployeeWage>();
	}

	public void addCompanyEmpWage(String company, int wage_per_hour, int working_days, int max_hour)
	{
		CompanyEmployeeWage companyEmployeeWage=new CompanyEmployeeWage(company, wage_per_hour, working_days, max_hour);
		empWageList.add(companyEmployeeWage);
		companyToEmoWageMap.put(company, companyEmployeeWage);
	}

	public void computeEmpWage()
	{
		for (int i = 0; i < empWageList.size(); i++)
		{
			CompanyEmployeeWage companyEmployeeWage=empWageList.get(i);
			companyEmployeeWage.setEmpWageperMonth(this.computeEmpWage(companyEmployeeWage));
			System.out.println(companyToEmoWageMap.get(companyEmployeeWage.COMPANY));
		}
		System.out.println(empWageList);
	}

	public int computeEmpWage(CompanyEmployeeWage companyEmployeeWage)
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
