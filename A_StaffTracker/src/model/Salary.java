package model;

public class Salary {
	private int salaryID;
    private int employeeID;
    private double salaryAmount;
	public int getSalaryID() {
		return salaryID;
	}
	public void setSalaryID(int salaryID) {
		this.salaryID = salaryID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public double getSalaryAmount() {
		return salaryAmount;
	}
	public void setSalaryAmount(double salaryAmount) {
		this.salaryAmount = salaryAmount;
	}
	public Salary(int salaryID, int employeeID, double salaryAmount) {
		super();
		this.salaryID = salaryID;
		this.employeeID = employeeID;
		this.salaryAmount = salaryAmount;
	}
    
}
