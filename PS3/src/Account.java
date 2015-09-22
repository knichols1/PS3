import java.util.Date;
import java.io.*;

public class Account {
	private double balance;
	private double annualIntrestRate;
	private Date dateCreate;
	private int id;

	Account() {
		id = 0;
		balance = 0;
	}

	Account(int id, double balance) {
		this.id=id;
		this.balance= balance;
	}

	public double getMonthlyIntrestRate(double annualIntrestRate) {
		return annualIntrestRate / 12;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	}

	public Date getDateCreate() {
		return dateCreate;
	}
}
