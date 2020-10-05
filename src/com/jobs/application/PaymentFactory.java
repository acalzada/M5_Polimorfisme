package com.jobs.application;

import com.jobs.domain.IPaymentRate;

/**
 * Class for implementing the IPaymentRate interface methods. It is called by JobsController object 
 * when creating the different employees.
 * 
 * @author angel
 *
 */
public class PaymentFactory {

	/**
	 * Creates the pay function for Boss employees.
	 * 
	 * Boss employees are paid their monthly salary with 50% increase.
	 * 
	 * @return IPaymentRate	Returns the interface for the pay method for Boss employees.
	 */
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				// Boss employees are paid their monthly salary with 50% increase.
				return salaryPerMonth * 1.5;
			}
		};
	}
	
	
	/**
	 * Creates the pay function for Regular employees.
	 * 
	 * Regular employees are paid their monthly salary reduced by 15%.
	 * 
	 * @return IPaymentRate	Returns the interface for the pay method for regular Employees.
	 */
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				// Regular employees are paid their monthly salary with a reduction of 15%.
				return salaryPerMonth * 0.85;   
			}
		};
	}
	
	
	/**
	 * Creates the pay function for Manager employees.
	 * 
	 * Manager employees are paid their monthly salary incremented by 10%.
	 * 
	 * @return IPaymentRate	Returns the interface for the pay method for Managers.
	 */
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				// Manager employees are paid their monthly salary with a 10% increment.
				return salaryPerMonth * 1.1;   
			}
		};
	}
	
	
}
