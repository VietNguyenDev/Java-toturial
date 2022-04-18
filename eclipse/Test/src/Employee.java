
public class Employee {
	private String nameEmp;
	private double basicPay;
	private double coefficientsSalary;
	public double MAX_SALARY;
	
	public Employee(String nameEmp, double basicPay, double coefficientsSalary, double mAX_SALARY) {
		super();
		this.nameEmp = nameEmp;
		this.basicPay = basicPay;
		this.coefficientsSalary = coefficientsSalary;
		MAX_SALARY = mAX_SALARY;
	}

	public Employee() {
		super();
	}

	public String getNameEmp() {
		return nameEmp;
	}

	public void setNameEmp(String nameEmp) {
		this.nameEmp = nameEmp;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public double getMAX_SALARY() {
		return MAX_SALARY;
	}

	public void setMAX_SALARY(double mAX_SALARY) {
		MAX_SALARY = mAX_SALARY;
	}
	
	public double calculateSalary() {
		return this.basicPay * this.coefficientsSalary;
	}
	
	public boolean increaseSalary(double Salary) {
		if(calculateSalary() < Salary) {
			return true;
		}
		
		return false;
	}
	
	public void displayInfo() {
		System.out.printf("Tên công nhân: " + this.getNameEmp());
		System.out.printf("Lương cơ bản: " + this.getBasicPay());
		System.out.printf("Hệ số lương: " + this.getCoefficientsSalary());
		System.out.printf("Lương cao nhất: " +this.getMAX_SALARY());
	}
		
}
