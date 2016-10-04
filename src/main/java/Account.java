import java.util.Date;

import Exception.InsufficientFundsException;
//How to make it a maven project
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		dateCreated = new Date();
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public double getMonthlyInterest(double annualInterestRate) {
		return annualInterestRate / 12;
	}

	public void withdraw(double withdraw) throws InsufficientFundsException {
		if (withdraw <= balance) {
			balance -= withdraw;
		}

		else {
			double required = withdraw - balance;
			throw new InsufficientFundsException(required);

		}

	}

	public void deposit(double deposit) {
		balance = balance + deposit;
	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;

	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public double getannualInterestRate() {
		return annualInterestRate;
	}

	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getdateCreated() {
		return dateCreated;
	}

	/**
	 * public void setdateCreated(Date dateCreated){ 
	 * this.dateCreated = dateCreated;
	 * 
	 * }
	 */
}

