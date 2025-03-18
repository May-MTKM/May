package array;

import java.util.Scanner;

class ClassExArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{Scanner a = new Scanner (System.in);
		int Minimum = Integer.MAX_VALUE;
		int Maximum = Integer.MIN_VALUE;
		System.out.println("Please enter numbers of values.");
		int Length = a.nextInt();
		int [] A = new int[Length];
		
	    for (int i = 0; i < Length; i++)
	    {System.out.println("Enter value " + (i + 1));
	    A[i] = a.nextInt();}
	    
	    System.out.print("Your enter values before Ascending are ");
	    
	    
	    for (int j = 0; j < Length; j++)
	    {System.out.print(A[j]);
	    if (j < Length- 1)
	    	System.out.print(",");}
	    
		int temp = 0;
	    
	    for (int k = 0; k < Length-1; k++)
	    {
	    	for (int m = k + 1; m < Length; m++)
	    	{
	    		if (A[m]<A[k])
	    			//SWAPPING PROCESS
	    	
	    		{temp = A[m];
	    		A[m] = A[k];
	    		A[k] = temp;}
	    		
	    	}
	    }
	    		
	    System.out.println();
	    System.out.print("Your enter values after Ascending are ");
	    
	    for (int l = 0; l < Length; l++)
	    {System.out.print(A[l]);
	    if (l< Length- 1)
	    	System.out.print(",");}
	    

	    
	    }
		}}
