package dataAccess;

import entity.Account;

public class AccountDAOMock implements AccountDAO {

	@Override
	public void saveAccount(Account account) {
		System.out.println("Save mock");

	}

	@Override
	public void updateAccount() {
		System.out.println("update mock");

	}

	@Override
	public void loadAccount() {
		System.out.println("load mock");

	}

	@Override
	public void getAccounts() {
		System.out.println("get mock");

	}

}
