package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Manager;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

/**
 * Class in charge of creating the employee registry and the implementing the different employee
 * constructor methods with the proper pay() method using the PaymentFactory class. 
 * 
 * @author angel
 *
 */
public class JobsController {
	
	// Registry of employees.
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
		Manager manager = new Manager(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
	}


	/**
	 * Method for paying all the employees in the registry.
	 * 
	 * Uses the pay() method for each employee type and prints on system output 
	 * the total accumulated paid amount for each employee.
	 * 
	 */
	public void payAllEmployeers() {
		
		System.out.println("PAYING ALL THE EMPLOYEES:\n");
		
		for(AbsStaffMember staffMember: repository.getAllMembers())
		{
			staffMember.pay();
			System.out.println("\t- " + staffMember.getName() + " has been paid a total of " + staffMember.getTotalPaid());
		}
		
		System.out.println("\n");
	}

	/**
	 * Method for retrieving a list of all the employee names in the registry.
	 * 
	 * @return allEmployees	String with each employee name in a single row.
	 */
	public String getAllEmployees() {
		
		String allEmployees = "\n";
		
		for(AbsStaffMember staffMember : repository.getAllMembers())
		{
			allEmployees += "\t- " + staffMember.getName() + "\n";
		}
		
		return allEmployees;
	}

	/**
	 * Creates a Volunteer person and adds to the Employee repository.
	 * 
	 * @param name String name of the volunteer.
	 * @param address Address of the volunteer.
	 * @param phone Phone number of the volunteer.
	 * @throws Exception Exception is thrown if the internal constructor method misses a description.
	 */
	public void createVolunteer(String name, String address, String phone) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, "Voluntario que no cobra");
		repository.addMember(volunteer);
	}
	
	
	
}
