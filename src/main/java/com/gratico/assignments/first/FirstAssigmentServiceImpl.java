package com.gratico.assignments.first;

public class FirstAssigmentServiceImpl implements FirstAssignmentService {

	public int add(int a, int b) {
		return  a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int modolus(int a, int b) {
		return a %  b;
	}

	public int power(int power, int base) {
		int variable = base; 
		for (int a=1 ; a <= power;  a++ ) {
			variable *= base;
		}
		return variable;
	}

	public boolean isOdd(int a) {
		if (a % 2  == 0 ) {
			return true;
		}
		return false;
	}

	public int[] sortByDesc(int[] args) {
		int n = args.length;  
		int temp = 0;  
		for (int i = 0; i < args.length - 1; i++)
		{
		  for(int j = 0; j < args.length - 1; j++)
		  {
		    if(args[j] < args[j + 1])
		    {
		      temp = args [j + 1];
		      args [j + 1]= args [i];
		      args [i] = temp;
		    }
		  }
		} 
		return args;
	}

	public int[] sortByAsc(int[] args) {
		int n = args.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(args[j-1] > args[j]){  
                                 //swap elements  
                                 temp = args[j-1];  
                                 args[j-1] = args[j];  
                                 args[j] = temp; 
                          }
                 }
         }
		return args;
	}

	public int findIndexByElement(int[] elements, int a) {
		
		int temp = 0;
		for(int i =  0 ; i <elements.length ; i ++){
			if (elements[i] == a) {
				temp = i; 
				
			}
			
		}
		
		return temp;
	
	}

	

}
