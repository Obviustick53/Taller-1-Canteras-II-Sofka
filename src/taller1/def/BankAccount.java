package taller1.def;

/**
 * Represents one ordinary bank account with some of the most common attributes
 * @author Jose Luis Mora
 */

public class BankAccount {

    /**
     * Represents the name of the bank to which the bank account is held.
     */
    public String bank;
    /**
     * Represents the number of the bank account
     */
    private int accountNumber;
    /**
     * Rerepsents if the bank account is activated or not
     */
    protected boolean activated;

    /**
     * Constructor of the BanckAccount class
     */

    public BankAccount() {

    }

    /**
     * Gets the name of the bank
     * @return bank
     */

    public String getBank() {
        return bank;
    }

    /**
     * Set the name of the bank
     */

    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * Get the number os the acoount like a integer
     * @return accountNumber
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Set the number of the account
     */

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Get if the bank account is activated or not
     * @return activated
     */

    public boolean isActivated() {
        return activated;
    }

    /**
     * Set the result if the bank account is activated or not
     */

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
