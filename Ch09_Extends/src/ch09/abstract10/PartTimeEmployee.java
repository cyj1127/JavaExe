package ch09.abstract10;

//일용직 사원
public class PartTimeEmployee extends Employee {

	protected int dailyPay;
	protected int workDay;

	public PartTimeEmployee(String empno, String name, int dailyPay, int workDay) {
		super(empno, name);
		this.dailyPay = dailyPay;
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		double mPay = dailyPay * workDay;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("DailyPay :" + dailyPay);
		System.out.println("WorkDay :" + workDay);
		System.out.println("MonthPay :" + getMonthPay());
	}

}
