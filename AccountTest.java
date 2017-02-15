package account.training.com;

public class AccountTest {

	public static void main(String[] args) {

		Account ac = new Account("Supraja",7731,1000.00); // Account class instantiation
		double var = ac.deposit(1000.00); // method calling
		System.out.println("The total amount is" +var);
		System.out.println(var);
		double var1 = ac.withdraw(200.00);
		System.out.println("The remaining amount is"+var1);
	}
	
}

