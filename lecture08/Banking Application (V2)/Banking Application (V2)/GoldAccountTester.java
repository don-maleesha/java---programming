public class GoldAccountTester {

    public static void main(String[] args) {
        GoldAccount acc = new GoldAccount("1234", "John Doe" );
        acc.deposit(2000);
        System.out.println(acc.getBalance());
        acc.withdraw(3000);
        System.out.println(acc.getBalance());
        acc.withdraw(6000);
        System.out.println(acc.gekBalance());

        BankAccount acc1 = new GoldAccount("2343", "Sam Smih" );
    }
}