package com.bridgelabz;
import java.util.Random;
public class EmployeeWage {
	
    static public void checkAttendance() {
    	Random randomInt=new Random();
    	int randInt=randomInt.nextInt(2);
    	if(randInt==1) {
    		System.out.println("Employee is present");
    	}
    	else {
    		System.out.println("Employee is absent");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Employee wage computation program");
       checkAttendance();
	}

}
