public interface EmpWageInterface
{
	public void addCompanyEmpWage(String company, int wage_per_hour, int working_days, int max_hour);
	public void computeEmpWage();
	public int getTotalWage(String company);

}
