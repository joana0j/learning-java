public class BankAccount {

    private int accountNumber;
    private double balance;
    public String titularUser;

    // set
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTitularUser(String titularUser) {
        this.titularUser = titularUser;
    }

    // get
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getTitularUser() {
        return titularUser;
    }

    public void displayDatasheet() {
        System.out.println("------ Bem-vindo ao Banco Meow ------");
        System.out.println("Titular: " + titularUser);
        System.out.println("Conta: " + accountNumber);
        System.out.println("Saldo " + balance);
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        BankAccount conta302 = new BankAccount();

        conta302.setTitularUser("Luke");
        conta302.setAccountNumber(6092);
        conta302.setBalance(5.308);
        conta302.displayDatasheet();
    }
}
