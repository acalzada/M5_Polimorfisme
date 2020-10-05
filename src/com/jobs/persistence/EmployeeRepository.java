package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

/**
 * Class to contain all the employees in form of a AbsStaffMember ArrayList.
 * 
 * @author BCNactiva, angel
 *
 */
public class EmployeeRepository {

	private static List<AbsStaffMember> members=new ArrayList<>();
	
	public EmployeeRepository(){
		
	}
	
	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	
	/**
	 * Method for adding new employees into the employee register.
	 *  
	 * @param member AbsStaffMember object of the employee to include in the registry.
	 * @throws Exception When the employee object to add to registry is null.
	 */
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
}
