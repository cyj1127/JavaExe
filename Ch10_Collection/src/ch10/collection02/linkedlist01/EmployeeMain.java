package ch10.collection02.linkedlist01;

public class EmployeeMain {
	public static void testInstanceOf() {		
		RegularEmployee regEmp = 
				new RegularEmployee("1111","홍길동",7000,3000);
		Employee emp = regEmp;
		
		if(emp instanceof RegularEmployee)
			System.out.println("Emp는 RegularEmployee의 객체이거나" + "자식 객체입니다.");
		if(emp instanceof TempEmployee)
			System.out.println("Emp는 TempEmployee의 객체이거나" + "자식 객체입니다.");
		if(emp instanceof PartTimeEmployee)
			System.out.println("Emp는 PartTimeEmployee의 객체이거나" + "자식 객체입니다.");
	}
	
public static void main(String[] args) {
	EmployeeManager em = new EmployeeManager();
	em.run();

}
}