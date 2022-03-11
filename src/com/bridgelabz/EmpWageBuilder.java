package com.bridgelabz;

public class EmpWageBuilder {
 String name;
 int monthlyWage;
 
 void totalWage(String name,int monthlyWage) {
	 this.name=name;
	 this.monthlyWage=monthlyWage;
 }
 void showInfo() {
	 System.out.println("Company name: "+name);
	 System.out.println("Total Wage :"+monthlyWage);
 }
}
