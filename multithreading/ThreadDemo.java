class MyThread extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Create Thread using Thread Class");
		}
	}
}

class ThreadDemo
{
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		System.out.println("Main Start");
		t1.start();
		System.out.println("Main End");
	}
}