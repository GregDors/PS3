import Exception.InsufficientFundsException;

public class Test {

	public static void main(String[] args) {
		Account a = new Account(1122, 20000);
		a.setannualInterestRate(4.5);
		try {
			System.out.println("Withdrawing $2500 from the account");
			a.withdraw(2500);
		} catch (InsufficientFundsException e) {
			
			e.printStackTrace();
		}
		System.out.println("Depositing $3000 into the account");
		a.deposit(3000);
		System.out.println(a.getbalance());
		System.out.println(a.getMonthlyInterest(4.5));
		System.out.println(a.getdateCreated());
		
		//Throws Exception
		Account b = new Account(1122, 20000);
		b.setannualInterestRate(4.5);
		try {
			System.out.println("Withdrawing $22000 from the account");
			b.withdraw(22000);
		} catch (InsufficientFundsException e) {
			System.out.println("I'm sorry but you do not have enough money. You are short $" + e.getAmount());
			e.printStackTrace();
		}
		System.out.println("Depositing $3000 into the account");
		b.deposit(3000);
		System.out.println(b.getbalance());
		System.out.println(b.getMonthlyInterest(4.5));
		System.out.println(b.getdateCreated());
	}

}
