import java.util.Scanner;


public class A1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No :");
        int acno = sc.nextInt();

        System.out.print("Enter Balance :");
        double balance = sc.nextDouble();
        double amount;

        // BankAccount bk = new BankAccount(acno,balance);
        CheckingAccount cA = new CheckingAccount(acno, balance);
        cA.deposit(sc);
        cA.getBalance();
        amount = cA.withdraw(sc);
        cA.deductFee(amount);
        cA.getBalance();

        }
}