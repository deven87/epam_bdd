package steps;

import org.assertj.core.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Account;

/**
 * AccountWithdrawl step definition class
 */
public class AccountWithdrawl {

	private Account account;
	private int dispensedAmount;

	@Given("I have a balance of ${int} in my account")
	public void i_have_a_balance_of_$_in_my_account(int accountBalance) throws Exception {
		account = new Account();
		account.addAmount(accountBalance);
		System.out.println(account.getAccountBalance());
	}

	@When("I request ${int}")
	public void i_request_$(int withdrawlAmount) throws Exception {
		dispensedAmount = account.withdrawlAmount(withdrawlAmount);
		System.out.println(account.getAccountBalance());
	}

	@Then("${int} should be dispensed")
	public void $_should_be_dispensed(int dispensedExpected) {
		Assertions.assertThat(dispensedAmount).as("is equal to").isEqualTo(dispensedExpected);
	}
}
