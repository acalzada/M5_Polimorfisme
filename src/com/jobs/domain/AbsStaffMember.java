package com.jobs.domain;

/**
 * Abstract class from which employee types derive.
 * 
 * @author BCNactiva, angel
 *
 */
public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0; // Accumulative amount paid to the person.

	private static int COUNTER_MEMBERS = 1;  // No idea what the hell is it.

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	
	// Method implemented in PaymentFactory called in JobsController.
	public abstract void pay();
	
	
	/**
	 * Getter method for the employee name.
	 * 
	 * @return name String with the employee name.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * 
	 * Getter method for the total amount paid to the employee.
	 * @return totalPaid Double amount of the total payments performed to the employee.
	 */
	public double getTotalPaid()
	{
		return this.totalPaid;
	}
}
