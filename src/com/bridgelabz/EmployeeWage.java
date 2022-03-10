package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_DAY_HOUR = 4;
	static final int DAYS_PER_MONTH = 20;
	static int days = 0;
	static int hours = 0;
	static int monthlyWage = 0;
	static Random randomInt = new Random();
	static int randInt = randomInt.nextInt(3);

	int checkAttendance(int randInt) {
		switch (randInt) {
		case 1:
			System.out.println("Full Time Employee is present");
			return FULL_DAY_HOUR;

		case 2:
			System.out.println("Part Time Employee is present");
			return PART_DAY_HOUR;
		default:
			System.out.println("Employee is absent");
			return 0;
		}

	}

	int calculateWage(int randInt) {
		int dailyWage = 0;
		switch (randInt) {
		case 1:
			System.out.println("Daily Wage of employee is :Rs." + FULL_DAY_HOUR * WAGE_PER_HOUR);
			dailyWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
			return dailyWage;

		case 2:
			System.out.println("Daily Wage of employee is :Rs." + PART_DAY_HOUR * WAGE_PER_HOUR);
			dailyWage = PART_DAY_HOUR * WAGE_PER_HOUR;
			return dailyWage;
		default:
			return dailyWage;
		}
	}

	void calculateMonthlyWage(EmployeeWage employee) {
		Random randomInt = new Random();

		while (days < 20 && hours <= 100) {
			int randInt = randomInt.nextInt(3);
			hours = hours + employee.checkAttendance(randInt);
			if (hours > 100) {
				hours = 100;
				monthlyWage = monthlyWage + employee.calculateWage(randInt) - WAGE_PER_HOUR * PART_DAY_HOUR;
				break;
			} 
			else {
				monthlyWage = monthlyWage + employee.calculateWage(randInt);
			}
			days += 1;
			if(employee.checkAttendance(randInt)==0) {
				days-=1;
			}
		}
		System.out.println("The monthly wage of the employee is Rs. " + monthlyWage);
		System.out.println("Total days the employee worked is " + days + " days");
		System.out.println("Total hours the employee Worked is " + hours + "hours");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee wage computation program");

		EmployeeWage employee = new EmployeeWage();
		employee.calculateMonthlyWage(employee);
	}

}
