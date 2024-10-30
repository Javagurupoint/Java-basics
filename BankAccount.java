 /* 2.Write a Java program that defines a class 'BankAccount' with private attributes 'accountNumber', 'accountHolderName', 
 and 'balance'. Provide public getter and setter methods to access and modify these attributes while ensuring
 that the balance cannot be set below zero.*/
 
 
class BankAccount{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber; 
    }

    
    public String getAccountNumber() {
        return accountNumber; 
    }

    
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName; 
    }

    
    public String getAccountHolderName() {
        return accountHolderName; 
    }

    
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be set below zero.");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}


class Enc {
	public static void main(String [] args){
		BankAccount b1=new BankAccount();
		b1.setAccountNumber("SBI-46353536");
		b1.setAccountHolderName("iswarya");
		b1.setBalance(3445893);
		
		System.out.println("The account number is: " + b1.getAccountNumber());
        System.out.println("The account holder name is: " + b1.getAccountHolderName());
        System.out.println("The bank balance is: " + b1.getBalance());
	}
}