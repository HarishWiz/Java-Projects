
import java.util.Scanner;

public class BankAccount {
	String userName;
	String AcNo;
	int InitialAmount;
	Scanner sc=new Scanner(System.in);
	
	public void Initial() {
		System.out.println("Enter Your Name:");
		userName=sc.next();
		System.out.println("Enter Your Account No:");
		AcNo=sc.next();
		System.out.println("Enter Your Initial Amount:");
		InitialAmount=sc.nextInt();
		System.out.println("Your Payment is Successful");
	}
	 
	public void deposit() {
		System.out.println("Enter the Amount:");
		int amount=sc.nextInt();
		InitialAmount=InitialAmount+amount;
		System.out.println("Your Deposit Was Successful");
	}
	public void withdraw() {
		System.out.println("Enter the Amount:");
		int withdrawamount=sc.nextInt();
		InitialAmount=InitialAmount-withdrawamount;
		System.out.println("Your Withdraw Was Successful");
	}
	public void balance() {
		int balance=InitialAmount;
		System.out.println("Your Balance is:"+balance);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BankAccount obj =new BankAccount();
		obj.Initial();
		while(true) {
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance");
		System.out.println("4.Exit");
		int key=sc.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("You Selected For Deposit:");
			obj.deposit();
			break;
			case 2:
				System.out.println("You Selected For Withdraw");
				obj.withdraw();
				break;
			case 3:
				System.out.println("You Selected for Balance");
				obj.balance();
				break;
			case 4:
				System.out.println("Thank You...");
				System.out.println("Exiting....");
				System.exit(0);
		default:
			System.out.println("Press No 1 to 4 Only...");
			break;
		}
	}
	}
}
