package com.bridgelabz;

public class Company {
   String name;
   int wagePerHour;
   int workingDays;
   int workingHoursMonthly;
   int monthlyWage;
   int[] dailyWage;
   void setInfo(String name,int wagePerHour,int workingDays,int workingHoursMonthly) {
	   this.name=name;
	   this.wagePerHour=wagePerHour;
	   this.workingDays=workingDays;
	   this.workingHoursMonthly=workingHoursMonthly;
	   this.dailyWage=new int[workingDays];
	   
   }
   
   void companyMonthlyWage(int monthlyWage) {
	   this.monthlyWage=monthlyWage;
   }
   
   void dailyWage(int dailyWage,int index) {
	   this.dailyWage[index]=dailyWage;
   }
}
