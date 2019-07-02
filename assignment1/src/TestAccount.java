//Cameron Collins

public class TestAccount
{
    public static void main(String[] args)
    {
        //Creates new account with certain variables
        Account account = new Account(1122, 20000, 0.045);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println(account.toString());

        System.out.println("--------------------------------------------------");

        //Creates another account with certain variables
        Account myAccount = new Account(1122, 10000, 0.045);

        System.out.println(myAccount.toString());
        System.out.println("Monthly Interest Rate:\t" + myAccount.getMonthlyInterestRate());
        System.out.println("Monthly Interest:\t\t" + myAccount.getMonthlyInterest());

        System.out.println("--------------------------------------------------");
        //Creates another account with certain variables
        Account yourAccount = new Account(1122, 100000, 0.045);

        System.out.println(yourAccount.toString());
        System.out.println("Monthly Interest Rate:\t" + yourAccount.getMonthlyInterestRate());
        System.out.println("Monthly Interest:\t\t" + yourAccount.getMonthlyInterest());
    }
}