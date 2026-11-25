package PolymorphismOverloading;

public class AccountCreations {
	
	public void createAccount(int i) {
		System.out.println("Saving Account");
	}
	public void createAccount(int i, int j) {
		System.out.println("Current Account");
	}
	public void createAccount(int i, int j, int k) {
		System.out.println("joint Account");
	}
	
	public static void main(String[] args) {
		AccountCreations ac=new AccountCreations();
		ac.createAccount(5,87);
	}
}
