
public class BankingApp {
	public static void main(String[] args) {
		Bank canarabank = new Bank(10000, 645328563425L, "Savings", "Muthu");
		Card visa_card = new Card(6234657492341123L);
		canarabank.login(visa_card, 1221);
		canarabank.login("Muthu", "password", "123ABC");
		
	}
}
