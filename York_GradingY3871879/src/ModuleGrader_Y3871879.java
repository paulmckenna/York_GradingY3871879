import java.util.*;
/**
 * Algorithims and Data Structures: Practical Programming Assignment 1
 * 
 * Module markr
 * 
 * @author (Paul McKenna) 
 * @version (050519)
 */

public class ModuleGrader_Y3871879 {

	int mark;
	

	//Method to categorise marks
	public String markModule ()
	
	{
	
	 if (mark < 40)
	 {
		 return  "Outright Fail";
	 }
	 
	 else if (mark > 39 && mark < 50 )
		 
	 {
		 return  "Compensatable Fail";
	}
	
	 else if (mark > 49 && mark < 60)
		 
	 {
		 return "Satisfactory";
	 }
	 else if (mark > 59 && mark < 70)
		 
	 {
		 return "Good";
	 }
	 
else if (mark > 69 && mark < 101)
		 
	 {
		 return "Excellent";
	 }
	return null; 
		 
}
// Method to get valid mark
	public void getValidModulemark()
	{
		//Prompt the user for a string 
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Please enter your mark");
     	mark =sc.nextInt();	
     	while (mark <0 || mark>100)
     	{
     		System.out.println("Invalid mark. Please reenter your mark");
         	mark =sc.nextInt();
	}
     	if (mark>=0 && mark<=100)
     	{
     		System.out.println("Thank you. Your mark is valid");
     	}
}
	
	//Method to take users through the grading process
	
	public void startMethodGrading()
	{
		char response;
		do
		{
		System.out.println("***********Module Grading Programme***********");
		System.out.println();
		getValidModulemark();
		System.out.println();
		System.out.println("Your Grade is " + markModule());
		System.out.println();
		Scanner sc=new Scanner(System.in);
     	System.out.println("Do you have another mark to grade?");
     	response =sc.next().charAt(0);
		
	}
		while (response == 'y' || response == 'Y');
		System.out.println();
		System.out.println("Thank You grading is complete");
	}
}
