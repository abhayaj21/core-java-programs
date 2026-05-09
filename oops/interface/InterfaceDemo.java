interface Practice
{
	void show();
	
    public static void demo()
	{
		System.out.println("Static Method Also define body in interface only static methods");
	}
}

class Demo implements Practice
{
	public void show()
	{
		System.out.println("Show Practice");
	}

	public void demo()
	{
		System.out.println("Overriden Demo");
	}
}

class InterfaceDemo
{
	public static void main(String[] args) {

		Demo d = new Demo();
		d.show();
		d.demo();
		Practice.demo();
	}
}