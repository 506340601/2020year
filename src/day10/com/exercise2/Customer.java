package day10.com.exercise2;

public class Customer {



    private String firstNmae;
    private String lastName;
    private Account account;

    public Customer(String f,String l){

        this.firstNmae = f;
        this.lastName = l;
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public void setFirstNmae(String firstNmae) {
        this.firstNmae = firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
