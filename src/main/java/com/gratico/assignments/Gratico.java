package com.gratico.assignments;

import com.gratico.assignments.first.FirstAssigmentServiceImpl;
import com.gratico.assignments.first.FirstAssignment;
import com.gratico.assignments.first.FirstAssignmentService;
import com.gratico.assignments.util.CommonUtility;

public class Gratico {
	
	static FirstAssignmentService service = new FirstAssigmentServiceImpl();
	
	public static void main(String[] args) {
		// first assignment
		Gratico.firstAssignment();
		

		
		
	}
	
	
	public static void firstAssignment() {
		// addition
		FirstAssignment.add();
		
		// subtraction
		FirstAssignment.subtract();
		
		// multiplication
		FirstAssignment.multiply();
		
		// Division
		FirstAssignment.divide();
	
		// modulus
		FirstAssignment.modolus();
	
		// power
		FirstAssignment.power();
		
		// odd or even
		FirstAssignment.isOdd();
		
		// sort by descending
		FirstAssignment.sortByDesc();
		
		// sort by ascending
		FirstAssignment.sortByAsc();
		
		// find index by element
		FirstAssignment.findIndexByElement();
	}

}
