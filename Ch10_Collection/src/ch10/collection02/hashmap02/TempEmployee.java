package ch10.collection02.hashmap02;

//임시직 사원
public class TempEmployee extends Employee{

	protected int yearSalary;
	protected int hireYear;
	
	public TempEmployee(String empno, String name,
			int yearSalary, int hireYear) {
		super(empno, name);
		this.yearSalary = yearSalary;
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)yearSalary/12;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		super.showEmployeeInfo();
		System.out.println("YearSalary :" + yearSalary);
		System.out.println("HireYear : " + hireYear);
		System.out.printf("MonthPay %.2f: \n",getMonthPay());
	}

}
