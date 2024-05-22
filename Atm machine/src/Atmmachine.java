import java.util.*;
class ATM{
	float Balance;
	
	int PIN=9315;
	
	public void checkpin() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter PIN : ");
		
		int enteredpin=sc.nextInt();
		if(enteredpin==PIN) {
			menu();
		}else {
			System.out.print("Invalid PIN");
		    checkpin();
		}
	}
	public void menu() {
		System.out.println("Enter your choice");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		if(opt==1) {
			checkbalance();
		}
		else if(opt==2) {
			withdrawMoney();
		}
		else if(opt==3) {
			DepositMoney();
		}
		else if (opt==4) {
			return;
		}
		else {
			System.out.println("Enter the valid choice");
		}
	}
	public void checkbalance() {
		System.out.println("Balance :"+Balance );
		menu();
	}
	public void withdrawMoney(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Amount : ");
		
		float amount=sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance=Balance-amount;
			System.out.println("amount withdrawl Successfully");
		}menu();
	}
	public void DepositMoney() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		float amount=sc.nextFloat();
		 Balance=Balance+amount;
		System.out.println("Money deposited successfully : ");
		menu();
	}
	
}
public class Atmmachine {

	public static void main(String[] args) {
		ATM obj =new ATM();
			obj.checkpin();

	}

}
