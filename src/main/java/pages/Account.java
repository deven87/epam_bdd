package pages;

public class Account {

	private int accountBalance;

	/**
	 * getAccountBalance
	 *
	 * @return Integer accountBalance
	 */
	public int getAccountBalance() {
		return accountBalance;
	}

	/**
	 * addAmount
	 *
	 * @param amount
	 * @throws Exception
	 */
	public void addAmount(int amount) throws Exception {
		if (amount < 0) {
			throw new Exception("Please enter correct amount");
		}
		this.accountBalance += amount;
	}

	/**
	 * withdrawlAmount
	 *
	 * @param amount
	 * @throws Exception
	 */
	public int withdrawlAmount(int amount) throws Exception {
		if (amount < 0) {
			throw new Exception("Please enter correct amount");
		} else if (amount > accountBalance) {
			throw new Exception("Please maintain sufficient balance for withdrawl");
		} else {
			accountBalance -= amount;
			return amount;
		}
	}
}
