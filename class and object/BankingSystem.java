import java.util.Scanner;
class Bank{

	private String customerName;
	private int accNo;
	private float accBal;
	private int accPin;
	static Scanner sc = new Scanner(System.in);

	public Bank()
	{

	}

	public Bank(String name, int accNo, float bal, int pin)
	{
		this.customerName = name;
		this.accNo = accNo;
		this.accBal = bal;
		this.accPin = pin;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}

	public void setAccPin(int pin)
	{
		this.accPin = pin;
	}

	public String getCustomerName(){return customerName;}
	public int getAccNo(){return accNo;}
	public float getAccBal(){return accBal;}
	public int getAccPin(){return accPin;}

	public void showInfo()
	{
		System.out.println("\nYour Name         = " + customerName);
		System.out.println("Account No        = " + accNo);
		System.out.println("Availabel Balance = " + accBal + "Rs");
	}

	public void depositeAmount()
	{
		System.out.print("Enter Accoutn No: ");
		int accno = sc.nextInt();

		if(accno == accNo)
		{
			System.out.print("Enter Account Pin: ");
			int pin = sc.nextInt();
			if(pin == accPin)
			{
				System.out.print("Enter Deposite Amount: ");
				float depoAmount = sc.nextFloat();

				if(depoAmount > 0)
				{
					accBal += depoAmount;
					System.out.println("\nAmount Deposite Successfully...");
					System.out.println("Availabel Balance = " + accBal);
				}
				else
				{
					System.out.println("Deposite Amount Must Be Greater than 0");
				}
			}
			else{
				System.out.println("Wrong Pin !!");
			}
		}
		else {
			System.out.println("Invalid Account No");
		}
	}

	public void withdrawalAmount()
	{
		System.out.print("Enter Accoutn No: ");
		int accno = sc.nextInt();

		if(accno == accNo)
		{
			System.out.print("Enter Account Pin: ");
			int pin = sc.nextInt();
			if(pin == accPin)
			{
				System.out.print("Enter Withdrwal Amount: ");
				float withdrwalAmount = sc.nextFloat();

				if(withdrwalAmount > 0)
				{
					if(withdrwalAmount < accBal)
					{
					accBal -= withdrwalAmount;
					System.out.println("\nAmount Withdrwal Successfully...");
					System.out.println("Availabel Balance = " + accBal);
					}
					else
					{
						System.out.println("Incfficient Balance..");
					}
				}
				else
				{
					System.out.println("Withdrwal Amount Must Be Greater than 0");
				}
			}
			else{
				System.out.println("Wrong Pin !!");
			}
		}
		else {
			System.out.println("Invalid Account No");
		}
	}


	public void changePin()
	{
		System.out.println("Change Your Pin Here...");
		System.out.print("\nEnter Account No: ");
		int accno = sc.nextInt();

		if(accno == accNo)
		{
			System.out.print("Enter Old Pin: ");
			int oldPin = sc.nextInt();

			if(accPin == oldPin)
			{
				System.out.print("Enter New Pin: ");
				int newPin = sc.nextInt();
				System.out.print("Enter Confirm Pin: ");
				int conPin = sc.nextInt();

				if(newPin != conPin)
				{
					System.out.println("New Pin And Confrim Pin Does not match");
				}
				else {
				setAccPin(conPin);
				System.out.println("Pin Change Successfully....");	
				}
			} 
			else{
				System.out.println("Old Pin Is Wrong...!!");
			}
		}
		else{
			System.out.println("Invalid Account No!!...");
		}
	}


}

class BankingSystem
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int accNo,accPin;
		float accBal;

		System.out.println("Welcome To Banking System...");
		System.out.println("First Open Accont Fill This Form here");
		/*Enter Customer Personal Information*/
		System.out.print("\nEnter Your Name: ");
		name = sc.nextLine();


		System.out.print("Enter Your Account No: ");
		accNo = sc.nextInt();


		System.out.print("Enter Opening Balance Amount: ");
		accBal = sc.nextFloat();


		System.out.print("Enter Accoutn Pin: ");
		accPin = sc.nextInt();

		Bank b1 = new Bank(name,accNo,accBal,accPin);
		System.out.println("Account Open Successfully...");
		int choice;

		do{
		System.out.println("\n1. Show Pass Book");
		System.out.println("2. Check Availabel Balance");
		System.out.println("3. Deposite Amount");
		System.out.println("4. Withdrwal Amount");
		System.out.println("5. Show Pin");
		System.out.println("6. Change Pin");
		System.out.println("7. Exit");

		System.out.print("\nEnter Choice: ");
		choice = sc.nextInt();

		switch(choice)
		{
			case 1:
				b1.showInfo();
				break;
			case 2:
				System.out.println("Availabel Balance = " + b1.getAccBal());
				break;
			case 3:
				b1.depositeAmount();
				break;
			case 4:
				b1.withdrawalAmount();
				break;
			case 5:
				System.out.println("Current Pin = " + b1.getAccPin());;
				break;
			case 6:
				b1.changePin();
				break;
			case 7:
				System.exit(0);
				break;

			default: 
				System.out.println("Invalid Choice!!");
				break;

		}
		}while(choice != 7);
	}
}