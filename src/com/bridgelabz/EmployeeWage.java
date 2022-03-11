package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
	//static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;
	static final int PART_DAY_HOUR = 4;
	//static final int DAYS_PER_MONTH = 20;
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

	int calculateWage(int randInt,Company company) {
		int dailyWage = 0;
		switch (randInt) {
		case 1:
			System.out.println("Daily Wage of employee is :Rs." + FULL_DAY_HOUR * company.wagePerHour);
			dailyWage = FULL_DAY_HOUR * company.wagePerHour;
			return dailyWage;

		case 2:
			System.out.println("Daily Wage of employee is :Rs." + PART_DAY_HOUR * company.wagePerHour);
			dailyWage = PART_DAY_HOUR * company.wagePerHour;
			return dailyWage;
		default:
			return dailyWage;
		}
	}

	void calculateMonthlyWage(EmployeeWage employee,Company company) {
		Random randomInt = new Random();

		while (days < company.workingDays && hours <= company.workingHoursMonthly) {
			int randInt = randomInt.nextInt(3);
			hours = hours + employee.checkAttendance(randInt);
			if (hours > company.workingHoursMonthly) {
				hours = company.workingHoursMonthly;
				monthlyWage = monthlyWage + employee.calculateWage(randInt,company) - company.wagePerHour * PART_DAY_HOUR;
				break;
			} 
			else {
				monthlyWage = monthlyWage + employee.calculateWage(randInt,company);
			}
			days += 1;
			if(employee.checkAttendance(randInt)==0) {
				days-=1;
			}
		}
		System.out.println("The name of company is "+ company.name);
		System.out.println("The monthly wage of the employee is Rs. " + monthlyWage);
		System.out.println("Total days the employee worked is " + days + " days");
		System.out.println("Total hours the employee Worked is " + hours + " hours");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Employee wage computation program");
       
		EmployeeWage employee = new EmployeeWage();
		Company company=new Company();
		System.out.println("Enter the name of the company :");
		String name=scan.nextLine();
		System.out.println("Enter wage per hour :");
		int wagePerHour=scan.nextInt();
		System.out.println("Enter the total working days: ");
		int workingDays=scan.nextInt();
		System.out.println("Enter total monthly working hours :");
		int workingHoursMonthly=scan.nextInt();
		
		company.setInfo(name, wagePerHour, workingDays, workingHoursMonthly);
		employee.calculateMonthlyWage(employee,company);
	}

}
