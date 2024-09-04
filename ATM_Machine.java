import java.util.Currency;
import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 5674;

    public void checkpin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);

        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            System.out.println("****************Welcome Sir****************");
            menu();
        } else {
            System.out.println("****************************************");
            System.out.println("Enter a valid pin");
            System.out.println("****************************************");
            checkpin();
        }
    }

    public void menu() {

        System.out.println("Enter Your Choice : ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("****************************************");
            System.out.println("Enter a Valid Choice......");
            System.out.println("****************************************");
        }
    }

    public void checkBalance() {
        System.out.println("****************************************");
        System.out.println("Balance : " + Balance);
        System.out.println("****************************************");
        menu();
    }

    public void withdrawMoney() {

        System.out.println("****************************************");
        System.out.println("Enter the  Amount you want to Withdraw : ");
        System.out.println("****************************************");
        Scanner sc = new Scanner(System.in);

        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("****************************************");
            System.out.println("Insufficient Balace......");
            System.out.println("****************************************");

        } else {
            Balance = Balance - amount;
            System.out.println("****************************************");
            System.out.println("Money Withdraw Successful.....");
            System.out.println("****************************************");

        }
        menu();
    }

    public void depositeMoney() {
        System.out.println("****************************************");
        System.out.println("Enter the Amount you want to Deposite : ");
        System.out.println("****************************************");

        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        Balance = Balance + amount;
        System.out.println("****************************************");
        System.out.println("Money Deposite Successful........");
        System.out.println("****************************************");

        menu();
    }
}

public class ATM_Machine {

    public static void main(String args[]) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
