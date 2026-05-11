import java.util.Scanner;
class InsufficientFundsException extends Exception
{
	private int amount;

	public InsufficientFundsException(String massage)
	{
		super(massage);
	}

	public InsufficientFundsException(String massage,int amt)
	{
		super(massage);
		this.amount = amt;
	}

	public int getAmt(){return this.amount;}
}


class CheckBalance
{
	private int balance = 0;

	public void depositeAmt(int amt)
	{
		this.balance += amt;
	}

	public void withdrwalAmt(int amt)throws InsufficientFundsException{
		if(amt > balance)
		{
			int bal = balance - amt;
			throw new InsufficientFundsException("Insufficient Balance",bal);
		}
		else
		{
			this.balance -= amt;
		}
	}

	public int getBal(){return this.balance;}
}

class UserDefinedException
{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		CheckBalance c = new CheckBalance();
		c.depositeAmt(1000);
		System.out.println(c.getBal());
		try{
		c.withdrwalAmt(100);
		System.out.println("Balance = " + c.getBal());
		}catch(InsufficientFundsException ex)
		{
			System.out.println("Amount Must be less than balance");
			System.out.println(ex.getMessage() + " " + ex.getAmt());
			ex.printStackTrace();
		}

	}
}