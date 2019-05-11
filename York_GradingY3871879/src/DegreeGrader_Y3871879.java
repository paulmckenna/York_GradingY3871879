import java.util.*;



/**
 * Algorithms and Data Structures: Practical Programming Assignment 1
 * 
 * Degree Grader
 * 
 * @author (Paul McKenna) 
 * @version (050519)
 *
 */
public class DegreeGrader_Y3871879 {
	
	int allModuleAverage;
	int ismModuleAverage;
	int outrightFails;
	int compFails;
	
	public String gradeDegree()
	
	{
	
		if ((allModuleAverage >=70) && (ismModuleAverage >=70) && (compFails == 0) && (outrightFails == 0))
		
		{
			return "Distinction";
		}
		
		else if((allModuleAverage >=60 && allModuleAverage <70) && (ismModuleAverage >=60 &&  ismModuleAverage < 70) && (compFails <20) && (outrightFails == 0))
		{
			return "merit";
		}
		
		else if((allModuleAverage >=50 && allModuleAverage <60) && (ismModuleAverage >=50 &&  ismModuleAverage < 60) && (compFails <40) && (outrightFails == 0))
		
		{
			return "Pass";
			
		}
		
		else if(outrightFails > 0)
		{
		return "Fail";
		
	}
		return null;
	}


	public void getAllModuleAverage()
	
	{
		
			//Prompt the user for a module average 
	     	Scanner sc=new Scanner(System.in);
	     	System.out.println("Please enter your average for all modules");
	     	allModuleAverage =sc.nextInt();	
	     	while (allModuleAverage <0 || allModuleAverage>100)
	     	{
	     		System.out.println("Invalid module. Please reenter your average mark");
	     		allModuleAverage =sc.nextInt();
		}
	     	if (allModuleAverage>=0 && allModuleAverage<=100)
	     	{
	     		System.out.println("Thank you. Your average mark is valid");
	     	}
	
	}
	
public void getISMModuleAverage()
	
	{
	//Prompt the user for ISM module average 
 	Scanner sc=new Scanner(System.in);
 	System.out.println("Please enter your average for all modules");
 	ismModuleAverage =sc.nextInt();	
 	while (ismModuleAverage <0 || ismModuleAverage>100)
 	{
 		System.out.println("Invalid module. Please reenter your average mark");
 		ismModuleAverage =sc.nextInt();
}
 	if (ismModuleAverage>=0 && ismModuleAverage<=100)
 	{
 		System.out.println("Thank you. Your average ISM mark is valid");
 	}	
	}

public void getCompFails()

{
	//Prompt the user for number of compensentable failed credits 
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Please enter the number of compensentable failed credits you have.");
	 	compFails =sc.nextInt();	
	 	while (compFails <0 || compFails>180)
	 	{
	 		System.out.println("Invalid number of credits. Please reenter the number of compensentable failed credits you have.");
	 		compFails =sc.nextInt();
	}
	 	if (compFails>=0 && compFails<=180)
	 	{
	 		System.out.println("Thank you. This is a valid number of credits");
	 	}	
}

public void getOutrightFails()

{
	Scanner sc=new Scanner(System.in);
 	System.out.println("Please enter the number of modules you have failed outright.");
 	outrightFails =sc.nextInt();	
 	while (outrightFails <0 || outrightFails>11)
 	{
 		System.out.println("Invalid number of modules. Please reenter the number of modules you have failed outright.");
 		outrightFails =sc.nextInt();
}
 	if (outrightFails>=0 && outrightFails<=11)
 	{
 		System.out.println("Thank you. This is a valid number of modules");
 	}	
}
	public void startDegreeGrading()
	
	{
		char response;
		do
		{
	System.out.println("************Degree Classification Program************");
	System.out.println();
	getAllModuleAverage();
	getISMModuleAverage();
	getCompFails();
	getOutrightFails();
	System.out.println("Your Degree Grade is " + gradeDegree());
	Scanner sc=new Scanner(System.in);
 	System.out.println("Do you have another degree to classify?");
 	response =sc.next().charAt(0);
	
}
	while (response == 'y' || response == 'Y');
	System.out.println();
	System.out.println("Thank You classification is complete");
}
	}



