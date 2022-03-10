package com.bridgelabz;
import java.util.Random;
public class EmployeeWage {
	static final int WAGE_PER_HOUR=20;
	static final int FULL_DAY_HOUR=8;
	static final int PART_DAY_HOUR=4;
	static final int DAYS_PER_MONTH=20;
	static int days=0;
    static int monthlyWage=0;
	static Random randomInt=new Random();
	static int randInt=randomInt.nextInt(3);
    void checkAttendance() {
    	switch(randInt) {
    	case 1:
    		System.out.println("Full Time Employee is present");
    		break;
    	
    	case 2:
    		System.out.println("Part Time Employee is present");
    		break;   	
    	default:
    		System.out.println("Employee is absent");
    		break;
    	}
    	
    
    }
    
     int calculateWage() {
    	 int dailyWage=0;
    	 switch(randInt) {
    		case 1:
    			System.out.println("Daily Wage of employee is :Rs."+FULL_DAY_HOUR * WAGE_PER_HOUR);
    		    dailyWage=FULL_DAY_HOUR * WAGE_PER_HOUR;
    		    return dailyWage;
    			
    		
    		case 2:
    			System.out.println("Daily Wage of employee is :Rs."+PART_DAY_HOUR * WAGE_PER_HOUR);
    			dailyWage=PART_DAY_HOUR * WAGE_PER_HOUR;
    			return dailyWage;
    		default:
        		return dailyWage;
    		}   	
    }
     
     void calculateMonthlyWage(EmployeeWage employee) {
    	 while(days<=20) {
    		 employee.checkAttendance();
        	 monthlyWage=monthlyWage+employee.calculateWage();
        	 days+=1;
    	 }
    	 System.out.println("The monthly wage of the employee is Rs. "+monthlyWage);
    	 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Employee wage computation program");
       EmployeeWage employee=new EmployeeWage();
       employee.calculateMonthlyWage(employee);
	}

}
