package com.gratico.assignments.first;

import com.gratico.assignments.util.CommonUtility;

public class FirstAssignment {
	
	public static void add() {
		 CommonUtility.printLine("ADDTION");
		FirstAssigmentServiceImpl sum1 =  new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER FIRST NUMBER");
		int a = Integer.parseInt(CommonUtility.read());
		CommonUtility.printLine("ENTER SECOND NUMBER");
		int b = Integer.parseInt(CommonUtility.read());
			int sum =sum1.add(a, b);
       CommonUtility.printLine("Sum is %d", sum);
	}

	public static void subtract() {
		CommonUtility.printLine("SUBTRACTION");
		FirstAssigmentServiceImpl diff1 = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER MINUEND");
		int a = Integer.parseInt(CommonUtility.read());
		CommonUtility.printLine("ENTER SUBTRAHEND");
		int b = Integer.parseInt(CommonUtility.read());
			int deff = diff1.subtract(a, b);
       CommonUtility.printLine("Difference is %d", deff);
	}

	public static void multiply() {
		CommonUtility.printLine("MULTIPICATION");
		FirstAssigmentServiceImpl pro1 = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER MULTIPLICAND");
		int a = Integer.parseInt(CommonUtility.read());
		CommonUtility.printLine("ENTER MILTIPLIER");
		int b = Integer.parseInt(CommonUtility.read());
			int pro = pro1.multiply(a, b);
       CommonUtility.printLine("Product is %d", pro);
	}

	public static void divide() {
		CommonUtility.printLine("DIVITION");
		FirstAssigmentServiceImpl div1 = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER DIVIDEND");
		int a = Integer.parseInt(CommonUtility.read());
		CommonUtility.printLine("ENTER DIVISOR ");
		int b = Integer.parseInt(CommonUtility.read());
			int div = div1.divide(a, b);
       CommonUtility.printLine("Quotient is %d", div);
	}

	public static void modolus() {
		CommonUtility.printLine("REMAINDER");
		FirstAssigmentServiceImpl mod1 = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER DIVIDEND");
		int a = Integer.parseInt(CommonUtility.read());
		CommonUtility.printLine("ENTER DIVISOR ");
		int b = Integer.parseInt(CommonUtility.read());
			int mod = mod1.modolus(a, b);
       CommonUtility.printLine("Remiender is %d", mod);
	}

	public static void power() {
		CommonUtility.printLine("POWER");
		FirstAssigmentServiceImpl pow1 = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER POWER");
		int a = Integer.parseInt(CommonUtility.read());
		CommonUtility.printLine("ENTER BASE ");
		int b = Integer.parseInt(CommonUtility.read());
			int pow = pow1.power(a, b);
       CommonUtility.printLine("Power is %d", pow);
	}

	public static void isOdd() {
		CommonUtility.printLine("ODD or NOT");
		FirstAssigmentServiceImpl odd1 = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER NUMBER ");
		int a = Integer.parseInt(CommonUtility.read());
		boolean odd = odd1.isOdd(a);
	       CommonUtility.printLine(" is a Odd %s", odd);
	}

	public static void sortByDesc() {
		CommonUtility.printLine("SORTING by DESCENDING ORDER");
		FirstAssigmentServiceImpl arr1 = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER SIZE ");
		int size = Integer.parseInt(CommonUtility.read());
		int array [] = new int [size]; 
			for (int a = 0; a < size ; a ++ ) {
				array[a] = Integer.parseInt(CommonUtility.read());
			}
			array = arr1.sortByDesc(array);
			for(int x: array) {
				CommonUtility.print("%d ", x);
			}
	}
		
		
	public static void sortByAsc() {
		CommonUtility.printLine("SORTING by ASCENDING ORDER");
		FirstAssigmentServiceImpl arr1 = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER SIZE ");
		int size = Integer.parseInt(CommonUtility.read());
		int array [] = new int [size]; 
			for (int a = 0; a < size ; a ++ ) {
				array[a] = Integer.parseInt(CommonUtility.read());
			}
			array = arr1.sortByAsc(array);
			for(int x: array) {
				CommonUtility.print("%d ", x);
			}
	}

	public static void findIndexByElement() {
		CommonUtility.printLine("FINDING ELEMENT");
		FirstAssigmentServiceImpl findI = new FirstAssigmentServiceImpl();
		CommonUtility.printLine("ENTER SIZE ");
		int size = Integer.parseInt(CommonUtility.read());
		int array[] = new int [size]; 
			for (int b = 0; b < size ; b ++ ) {
				array[b] = Integer.parseInt(CommonUtility.read());
			}
			CommonUtility.printLine("NUMBER");
			int a  = Integer.parseInt(CommonUtility.read());
			int asd = findI.findIndexByElement(array, a);
			
				CommonUtility.print("%d ", asd);
			
		}
		
	}

