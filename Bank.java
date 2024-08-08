
public class Bank {

	double account_balance;
	long account_number;
	String account_type;
	String customer_name;



	public Bank(double account_balance, long account_number, String account_type, String customer_name) {
		this.account_balance = account_balance;
		this.account_number = account_number;
		this.account_type = account_type;
		this.customer_name = customer_name;
	}



	private void displayAccountDetails() {
		System.out.println("Welcome " + this.customer_name+" !");
		System.out.println("Here are your account details:");
		System.out.println("------------------------------");
		System.out.println("Account Type: " + this.account_type);
		System.out.println("Account Number: " + this.account_number);
		System.out.println("Account Balance: " + this.account_balance);
		System.out.println("------------------------------");
	}

	void login(Card c, int pin) {
		if (c.card_number == 6234657492341123L && pin == 1221) {
			displayAccountDetails();
		}
		else {
			System.out.println("Invalid card details");
		}
	}

	void login(String username, String password, String captcha) {
		if (username.equals(this.customer_name)&& password.equals("password") && captcha.equals("123ABC")) {
			displayAccountDetails();
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
}

class Card{
	long card_number;

	public Card(long card_number) {
		this.card_number = card_number;
	}
	
	
}
