package com.bdlz.empayrolljdbc;

public class EmployeePayrollService {

	public static void main(String[] args) {
		EmployeePayrollService service = new EmployeePayrollService();
		service.getConnection();
	}
	
	private void getConnection() {
		Employee.getConnection();
	}

}
