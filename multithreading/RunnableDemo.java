class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Create Thread using Runnable");
		}
	}
}

class RunnableDemo
{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		t1.start();
		System.out.println("End Main");
	}
}