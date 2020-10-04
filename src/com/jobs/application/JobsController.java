package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		
	}


	public void payAllEmployeers() {
		
		System.out.println("PAYING ALL THE EMPLOYEES:\n");
		
		for(AbsStaffMember staffMember: repository.getAllMembers())
		{
			staffMember.pay();
			System.out.println("\t- " + staffMember.getName() + " has been paid a total of " + staffMember.getTotalPaid());
		}
		
		System.out.println("\n");
	}

	public String getAllEmployees() {
		
		String allEmployees = "\n";
		
		for(AbsStaffMember staffMember : repository.getAllMembers())
		{
			allEmployees += "\t- " + staffMember.getName() + "\n";
		}
		
		return allEmployees;
	}

	public void createVolunteer(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
