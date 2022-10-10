import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        bankAccount accountOne = new bankAccount("Charlie", 5000);

        accountOne.withdraw(1000);
        accountOne.deposit(200);
        accountOne.withdraw(100);

        System.out.println(accountOne.getOwner());
        System.out.println(accountOne.getBalance());

    }

}
