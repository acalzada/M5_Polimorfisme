package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	/**
	 * Creates the pay function for Boss employees.
	 * 
	 * Boss employees are paid their monthly salary with 50% increase.
	 * 
	 * @return IPaymentRate	Returns the interface for the pay method.
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
	 * @return IPaymentRate	Returns the interface for the pay method.
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
	
	
}
