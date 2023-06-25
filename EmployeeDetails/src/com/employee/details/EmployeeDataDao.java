package com.employee.details;

public class EmployeeDataDao 
{
	 public int empId;
	 public String empName;
	 public String empEmail;
	 public String empMobileNo;
	 
	 //using parameterized Constructor
	public EmployeeDataDao(int empId, String empName, String empEmail, String empmobile) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMobileNo = empmobile;
	}
	
	//using getter setter Method

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpMobileNo() {
		return empMobileNo;
	}

	public void setEmpMobileNo(String empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	//override ToString method
	@Override
	public String toString() {
		return "EmployeeDataDao [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empMobileNo="
				+ empMobileNo + "]";
	}

}
