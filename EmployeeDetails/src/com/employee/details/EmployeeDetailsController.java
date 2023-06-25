package com.employee.details;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDetailsController 
{
	public static void main(String[] args)
	{ 
		  //using arrayList
		  ArrayList<EmployeeDataDao> list = new ArrayList<>();
		
		  //take input from user 
		  Scanner scanner = new Scanner(System.in);

		   int data;
		  //do while loop used 
		do
		{
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("Enter option");
		
			data=scanner.nextInt();
			
			//using switch statement print employee details
		switch(data)
		{
		case 1:
			//validation for employee id
			System.out.println("Enter Employee Id");
			int empid=scanner.nextInt();
			
			for(EmployeeDataDao employee : list)
			{
				while(employee.getEmpId()==empid)
			         {
					    System.out.println("Duplicate Employee Id");
					    System.out.println( "Please Enter Correct Employee Id");
					    empid=scanner.nextInt();
					    System.out.println("Employee Id Successfully Updated");
		    }
			}
	        
			//validation for employee name	
			System.out.println("Enter Employee Name");
			String empname =scanner.next();
	        String nameRegex=("[a-zA-Z]*");
	        while(empname.matches(nameRegex)==false)
	        {
	        	System.out.println("Invalid Employee Name");
	        	System.out.println( "Please Enter Correct Employee Name");
	        	empname =scanner.next();
	            System.out.println("Employee Name Successfully Updated");
	        }
	        
	        
	         //validation for employee emailId
			 System.out.println("Enter Employee EmailId");
			 String empemail = scanner.next();
			 String emailRegex="[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";
			 while (empemail.matches(emailRegex)==false)
			 {
			     System.out.println("Invalid Employee EmailId");
			     System.out.println("Please Enter Correct Employee EmailId");
			     empemail = scanner.next();
			     System.out.println("Employee EmailId Successfully Updated");
			    
			 }
			
				
			 //validation for employee mobileNumber

			 System.out.println("Enter Employee MobileNumber");
			 String empmobile = scanner.next();
			 String mobileRegex="\\d{10}";
			
			  while(empmobile.matches(mobileRegex)==false)
		     {
				 System.out.println("Invalid Employee MobileNumber");
			     System.out.println("Please Enter Correct Employee MobileNumber");
			     empmobile = scanner.next();
			
			     System.out.println("Employee MobileNumber Successfully Updated");
			 }
				
				//adding data into list
			
				list.add(new EmployeeDataDao(empid,empname,empemail,empmobile));
				break;
				
			case 2:
				//iterate the list 
				Iterator<EmployeeDataDao> iterator = list.iterator();
				while(iterator.hasNext())
				{
					  EmployeeDataDao employee=  iterator.next();
					  System.out.println(employee);
				}
				break;
				
			case 3:
		      
				System.out.println("Enter employee id to search");
				empid=scanner.nextInt();
			    iterator = list.iterator();
				while(iterator.hasNext())
				{
					    EmployeeDataDao employee=  iterator.next();
					    if(employee.getEmpId()==empid)
					    {
					    	System.out.println(employee);
					    }
					 
				}
				   break;	
				
			}
		}while(data!=0);
	}
}

