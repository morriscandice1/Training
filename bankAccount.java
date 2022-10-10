public class bankAccount {
    private String owner;
    private double balance;


public bankAccount(String owner, int startingBalance) {
    this.owner = owner;
    this.balance = Math.max(startingBalance, 0);
}
 public String getOwner() {
        return owner; //this getter makes owner accessible
        //I am writing a public method to access a private attribute, in this case, owner
    }
    public double getBalance() {
        return balance; //this getter makes that balance accessible
    //I am writing a public method to access a private attribute, balance.
    }
    //deposit method
    public double deposit(double amt) {
    if (amt > 0) { //if amount is greater than 0
        this.balance = this.balance + amt; //balance + amt
        return amt; //balance + amt = new amt
    }
        return 0; //if not an amt > 0, then 0 is the returned amt
    }
    //withdraw method
    public double withdraw(double amt) {
        if (amt<= this.balance) { //If amount is less than or equal to balance
        this.balance = this.balance - amt; //balance - amt
        return amt; //balance - amt = new amt
        }
        return 0; //instead return 0
    }
}
