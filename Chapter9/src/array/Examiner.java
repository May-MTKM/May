package array;

import java.util.Scanner;

public class Examiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{Scanner s = new Scanner (System.in);
		
		//NUMBERS OF STUDENTS
		System.out.println("Please enter numbers of students.");
		int Students = s.nextInt();
		
		//ARRAYS
		String [] Name = new String[Students];
		String [] Gender = new String[Students];
		int [] Myanmar = new int[Students];
		int [] Math = new int[Students];
		int [] English = new int[Students];
		int [] Total = new int[Students];
		String [] Results = new String[Students];
		Double [] Average = new Double[Students];
		//ARRAYS
		 int PassCounts = 0;
	        int TotalMarkAll = 0;
	        int TotalMyanmarMark = 0;
	        int TotalMathMark = 0;
	        int TotalEnglishMark = 0;
	        int Maximum = Integer.MIN_VALUE;
	        String TopStudent = "";
		
		for (int a = 0; a < Students; a++)
		{//START OF LOOP
	
		switch (a) 
		{
		case 0: {System.out.println("Please enter " + (a+1) + "st student name");}
		Name[a] = s.nextLine();
		break;
		
		case 1:{System.out.println("Please enter " + (a+1) + "nd student name.");}
		Name[a] = s.nextLine();
		break;
		
		case 2: {System.out.println("Please enter " + (a+1) + "rd student name.");}
		Name[a] = s.nextLine();
		break;
		
		default: {System.out.println("Please enter " + (a+1) + "th student name.");}
		Name[a] = s.nextLine();
		break; 
		}//END OF SWITCH
		
		Name[a] = s.nextLine();
			
	    System.out.println("Please enter gender. (M/F)");
	    Gender[a] = s.nextLine();
		
	    System.out.println("Please enter " + Name[a] + "'s Myanmar marks.");
	    Myanmar[a] = s.nextInt();
	    
	    
	    System.out.println("Please enter " + Name[a] + "'s Math marks.");
	    Math[a] = s.nextInt();
	    
	    
	    System.out.println("Please enter " + Name[a] + "'s English marks.");
	    English[a] = s.nextInt();
	    
	    Total[a] = Myanmar[a] + Math[a] +  English[a];
	    
	    if (Myanmar[a] > 40 && Math[a] > 40 && English[a] > 40 )
	      {Results[a]=("Passed");
	      System.out.println("Total mark of " + Name[a] + " is " + Total [a] + " (Passed)");
	      PassCounts++;}
	      
	      else
	      {Results[a]=("Failed");
	      System.out.println("Total mark of " + Name[a] + " is " + Total [a] + " (Failed)");}
	    
	    TotalMarkAll += Total[a];
	    TotalMyanmarMark += Myanmar[a];
	    TotalMathMark += Math[a];
	    TotalEnglishMark += English[a];
	    
	    if (Total[a] > Maximum) {
	    	Maximum = Total[a];
            TopStudent = Name[a];
	    }
	
	  
	    }//END OF LOOP
		
		double PassedRate = (double) PassCounts / Students * 100;
        double AverageMarkAll = (double)TotalMarkAll / (Students * 3);
        double AverageMyanmar =  (double)TotalMyanmarMark / Students;
        double AverageMath =  (double)TotalMathMark / Students;
        double AverageEnglish = (double)TotalEnglishMark / Students;

        
		if (PassCounts == Students)
		{System.out.println("All Students passed");}
		
		else 
		{System.out.println(PassCounts + " out of " + Students + " passed.");}
		
		System.out.println("Passed Rate : " + PassedRate + "%");
		System.out.println("Average Mark (All Subjects) : " + AverageMarkAll);
		System.out.println("Average Myanmar Mark : " + AverageMyanmar);
		System.out.println("Average Math Mark : " + AverageMath);
		System.out.println("Average English Mark : " + AverageEnglish);
		System.out.println(TopStudent + " got the highest mark with " + Maximum + ".");

		 System.out.println("Students' Summary");
		 System.out.println("Name     Gender     Myanmar     Math     English     Total     Results");
	     System.out.println("====     ======     =======     ====     =======     =====     =======");
	    
	     for (int j = 0; j < Students; j++)
		    {System.out.println(Name[j] + "       " + Gender[j] + "          " + Myanmar[j] + "          " + Math[j] + 
		    		"         "  + English[j] + "        " + Total[j] + "      " + Results[j]);
		    }
		
		}//END OF SCANNER
	}}

