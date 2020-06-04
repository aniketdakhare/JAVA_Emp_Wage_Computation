public class CompanyEmployeeWage
{
	public final int WAGE_PER_HOUR;
	public final int WORKING_DAYS;
	public final int MAX_HOURS;
	public final String COMPANY;
	public int empWageperMonth;

	public CompanyEmployeeWage(String company, int wage_per_hour, int working_days, int max_hour)
	{
		this.WAGE_PER_HOUR=wage_per_hour;
		this.WORKING_DAYS=working_days;
		this.MAX_HOURS=max_hour;
		this.COMPANY=company;
	}

	public void setEmpWageperMonth(int empWageperMonth)
	{
		this.empWageperMonth=empWageperMonth;
	}

	@Override
	public String toString()
	{
		return "Monthly Employee wage of "+COMPANY+" is Rs. "+empWageperMonth;
	}

}
