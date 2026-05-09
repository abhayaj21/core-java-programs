class Base
{
	public void show()
	{
		System.out.println("Base: Show");
	}

	public Base(int d)
	{
		System.out.println("Base Consturctor");
	}
	public Base()
	{

	}
}

class Derrived extends Base
{
	public void show()
	{
		super.show();
		System.out.println("Derrived Show");
	}
}

class PloymorephismDemo
{
	public static void main(String[] args) {
/*
		Base b = new Base();
		b.show();*/
		Base d = new Derrived();
		// Derrived d = new Derrived();
		d.show();
	}
}