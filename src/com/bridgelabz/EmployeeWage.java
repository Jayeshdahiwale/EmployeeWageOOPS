package com.bridgelabz;
import java.util.Random;
public class EmployeeWage {
	static final int WAGE_PER_HOUR=20;
	static final int FULL_DAY_HOUR=8;
	static final int PART_DAY_HOUR=4;
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
    
     void calculateWage() {
    	 switch(randInt) {
    		case 1:
    			System.out.println("Daily Wage of employee is :Rs."+FULL_DAY_HOUR * WAGE_PER_HOUR);
    			break;
    		
    		case 2:
    			System.out.println("Daily Wage of employee is :Rs."+PART_DAY_HOUR * WAGE_PER_HOUR);
    			break;
    		default:
        		break;
    		}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Employee wage computation program");
       EmployeeWage employee=new EmployeeWage();
       employee.checkAttendance();
       employee.calculateWage();
	}

}
