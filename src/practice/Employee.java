package practice;

import java.util.UUID;

public class Employee {
	UUID employeeId;
	String employeeName;
	String employeeSkills;
	int employeeAge;
	double employeeSalary;
	String date;
	
	public Employee()
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSkills=employeeSkills;
		this.employeeAge=employeeAge;
		this.employeeSalary=employeeSalary;
		this.date=date;
				
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeSkills=" + employeeSkills + ", employeeAge=" + employeeAge + ", employeeSalary=" +employeeSalary
				+ ", date=" + date + "]";
		
	}

	public UUID getEmployeeId()
	{
		return employeeId;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public String getEmployeeSkills()
	{
		return employeeSkills;
	}
	
	public int getEmployeeAge()
	{
		return employeeAge;
	}
	
	public double getEmployeeSalary()
	{
		return employeeSalary;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setEmployeeId(UUID employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeSkills(String employeeSkills) {
		this.employeeSkills = employeeSkills;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
