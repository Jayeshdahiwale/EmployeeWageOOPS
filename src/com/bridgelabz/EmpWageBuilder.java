package com.bridgelabz;
import java.util.ArrayList;
public class EmpWageBuilder {
 
 static ArrayList<Company> companyList=new ArrayList<Company>();
 
 void showInfo(Company company) {
	 System.out.println("Company name: "+company.name);
	 System.out.println("Total Wage :"+company.monthlyWage);
 }
 
 void addCompany(Company company) {
	 companyList.add(company);
 }
}
