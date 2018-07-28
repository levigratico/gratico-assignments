package com.gratico.assignments.first;

import com.gratico.assignments.util.CommonUtility;

public class FirstAssignment {
	
//	public static void add() {
//		FirstAssigmentServiceImpl sum1 =  new FirstAssigmentServiceImpl();
//		int a = Integer.parseInt(CommonUtility.read());
//		int b = Integer.parseInt(CommonUtility.read());
//			int sum =sum1.add(a, b);
//       CommonUtility.printLine("Sum is %d", sum);
//	}
//
//	public static void subtract() {
//		FirstAssigmentServiceImpl diff1 = new FirstAssigmentServiceImpl();
//		int a = Integer.parseInt(CommonUtility.read());
//		int b = Integer.parseInt(CommonUtility.read());
//			int deff = diff1.subtract(a, b);
//       CommonUtility.printLine("Difference is %d", deff);
//	}
//
//	public static void multiply() {
//		FirstAssigmentServiceImpl pro1 = new FirstAssigmentServiceImpl();
//		int a = Integer.parseInt(CommonUtility.read());
//		int b = Integer.parseInt(CommonUtility.read());
//			int pro = pro1.multiply(a, b);
//       CommonUtility.printLine("Product is %d", pro);
//	}
//
//	public static void divide() {
//		FirstAssigmentServiceImpl div1 = new FirstAssigmentServiceImpl();
//		int a = Integer.parseInt(CommonUtility.read());
//		int b = Integer.parseInt(CommonUtility.read());
//			int div = div1.divide(a, b);
//       CommonUtility.printLine("Quotient is %d", div);
//	}
//
//	public static void modolus() {
//		FirstAssigmentServiceImpl mod1 = new FirstAssigmentServiceImpl();
//		int a = Integer.parseInt(CommonUtility.read());
//		int b = Integer.parseInt(CommonUtility.read());
//			int mod = mod1.modolus(a, b);
//       CommonUtility.printLine("Remiender is %d", mod);
//	}

	public static void power() {
		FirstAssigmentServiceImpl pow1 = new FirstAssigmentServiceImpl();
		int a = Integer.parseInt(CommonUtility.read());
		int b = Integer.parseInt(CommonUtility.read());
			int pow = pow1.power(a, b);
       CommonUtility.printLine("Power is %d", pow);
	}

	public static void isOdd() {
		FirstAssigmentServiceImpl odd1 = new FirstAssigmentServiceImpl();
		int a = Integer.parseInt(CommonUtility.read());
		boolean odd = odd1.isOdd(a);
	       CommonUtility.printLine(" is a Odd %s", odd);
	}

	public static void sortByDesc() {
		FirstAssigmentServiceImpl arr1 = new FirstAssigmentServiceImpl();
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
		
		
//	public static void sortByAsc() {
//		FirstAssigmentServiceImpl arr1 = new FirstAssigmentServiceImpl();
//		int size = Integer.parseInt(CommonUtility.read());
//		int array [] = new int [size]; 
//			for (int a = 0; a < size ; a ++ ) {
//				array[a] = Integer.parseInt(CommonUtility.read());
//			}
//			array = arr1.sortByAsc(array);
//			for(int x: array) {
//				CommonUtility.print("%d ", x);
//			}
//	}

	public static void findIndexByElement() {}
}
