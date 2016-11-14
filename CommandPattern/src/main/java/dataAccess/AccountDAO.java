package dataAccess;

import entity.Account;

/**
 * Created by 985191 on 11/1/2016.
 */
public interface AccountDAO {

    public void saveAccount(Account account);
    public void updateAccount();
    public void loadAccount();
    public void getAccounts();
}
