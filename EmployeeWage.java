import java.util.Random;

public class EmployeeWage
{
        static final int FULLTIME=1;
        static final int PARTTIME=2;

        void salary(String company, int wage_per_hour, int working_days, int max_hour_per_month)
        {
                int daily_hours=0, totalEmpHours=0, totalWorkingDays=0;
                Random r = new Random();
                while (totalEmpHours < max_hour_per_month && totalWorkingDays < working_days )
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
                int empWageperMonth=totalEmpHours*wage_per_hour;
                System.out.println("Monthly Employee wage of "+company+" is Rs. "+empWageperMonth);
        }
        public static void main(String[] args)
        {
                System.out.println("Welcome to Employee Wage Computation Program");
                EmployeeWage emp=new EmployeeWage();
                emp.salary("Dmart",20,22,104);
                emp.salary("Relience Fresh",25,20,96);
        }
}
