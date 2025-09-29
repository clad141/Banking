import java.util.Scanner;
public class Banking {
    static void checkBalance(double b){
        System.out.println("Your balance is $"+ b);
    }
    static double deposit(){
        Scanner input = new Scanner(System.in);
        double amount;
        System.out.print("Enter amount to deposit:");
        amount = input.nextDouble();
        if(amount < 0){
            System.out.println("Invalid amount.");
            return 0;
        }else{
            System.out.println("$"+ amount + "has been succefully deposited.");
            return amount;
        }
    }
    static double withdraw(double bal){
        Scanner display = new Scanner(System.in);
        double amount;
        System.out.print("Enter amount to withdraw:");
        amount = display.nextDouble();
        if(amount > bal){
            System.out.println("Insufficient funds.Plaese recharge with option 2.");
            return 0;
        }else if(amount < 0){
            System.out.println("Invalid amount.");
            return 0;
        }
        else{
            System.out.println("$"+ amount + "has been succefully withdrawn.");
            return amount;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        double balance = 0;
        while(isRunning){
            System.out.println("Welcome To EarnBank.");
            System.out.println("\t1.Check Balane\n\t2.Deposit\n\t3.Withdraw\n\t4.Exit");
            System.out.print("Select the options (1,2,3 or 4):");
            int choice = scanner.nextInt();
            if(choice == 1){
                checkBalance(balance);
            }else if(choice == 2){
                balance += deposit();
                checkBalance(balance);
            }else if(choice == 3){
                balance -= withdraw(balance);
                checkBalance(balance);
            }else if(choice == 4){
                isRunning = false;
            System.out.println("Thank you.Your are welcomed again.");
            }else{
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
    
}