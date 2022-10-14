package AccountDebit;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MainAccount {
    public static void main(String[] args)
    {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",account2.getBalance());
        Scanner input = new Scanner(System.in);
        double withdrawAmount;
        System.out.println("Enter debit amount for account1:");
        withdrawAmount = input.nextDouble();
        System.out.printf("\ndeducting %.2f from account1 balance\n\n",withdrawAmount);
        account1.debit(withdrawAmount);
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",account2.getBalance());
        System.out.println("Enter withdraw amount for account2:");
        withdrawAmount = input.nextDouble();
        System.out.printf("\ndeducting %.2f from account2 balance\n\n",withdrawAmount);
        account2.debit(withdrawAmount);
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",account2.getBalance());
    }
}


