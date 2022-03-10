package com.bridgelabz;
import java.util.Random;
public class App {
	static final int WAGE_PER_HOUR=20;
	static final int FULL_DAY_HOUR=8;
	static Random randomInt=new Random();
	static int randInt=randomInt.nextInt(2);
    static void checkAttendance() {
    	
    	if(randInt==1) {
    		System.out.println("Employee is present");
    	}
    	else {
    		System.out.println("Employee is absent");
    	}
    }
    
    static void calculateWage() {
    	if(randInt==1) {
    		int dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
    		System.out.println("Daily wage of the employee is Rs."+dailyWage); 
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Employee wage computation program");
       checkAttendance();
       calculateWage();
	}

}
