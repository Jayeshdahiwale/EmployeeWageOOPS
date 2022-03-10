package com.bridgelabz;
import java.util.Random;
public class EmployeeWage {
	static final int WAGE_PER_HOUR=20;
	static final int FULL_DAY_HOUR=8;
	static final int PART_DAY_HOUR=4;
	static Random randomInt=new Random();
	static int randInt=randomInt.nextInt(3);
    void checkAttendance() {
    	
    	if(randInt==1) {
    		System.out.println("Full time Employee is present");
    	}
    	else if(randInt==2) {
    		System.out.println("Part time employee present");
    	}
    	else {
    		System.out.println("Employee is absent");
    	}
    }
    
     void calculateWage() {
    	if(randInt==1) {
    		int dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
    		System.out.println("Daily wage of the employee is Rs."+dailyWage); 
    	}
    	else if(randInt==2) {
    		int dailyWage=WAGE_PER_HOUR*PART_DAY_HOUR;
    		System.out.println("Daily wage of the employee is Rs."+dailyWage);
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
