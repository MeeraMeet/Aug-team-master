package com.oops;

public class Bank {
	String bank;//name
	String type; // Commercial, wholesale, retail, finInstitution
	int employees; //count
	String wing; // Forex or Credit or checking or savin or debit

	public Bank(String bankName, String bankType, int count, String deptOfBank)
	{
		this.bank = bankName;
		this.type = bankType;
		this.employees = count;
		this.wing = deptOfBank;
	}
	public static void main(String[] args) {
		Bank boa = new Bank("BOFA","Commercial",1000000,"Forex");
		System.out.println(boa.bank+ " " + boa.wing);
		Bank wells = new Bank("Wells","WIMT",2000000,"Credit, Realestate, SLA");
		System.out.println(wells.bank+ " " + wells.type);
		Bank jpmc = new Bank("JPMorgan","FinancialInstitute",1300000,"All");
		System.out.println(jpmc);
	}
}
