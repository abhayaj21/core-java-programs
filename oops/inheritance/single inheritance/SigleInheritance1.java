class Base
{
	protected int a;
	protected int b;

	public Base()
	{
		System.out.println("Base Class Constructor");
	}

	public void bSetVal(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public void bShow()
	{
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

	public int getA(){return a;}
	public int getB(){return b;}
}

class Derrived extends Base
{
	protected int c;
	protected int d;

	public void dSetVal(int c, int d)
	{
		this.c = c;
		this.d = d;
	}

	public Derrived()
	{
		System.out.println("Derrived Constructor");
	}

	public void dShow()
	{
		bShow();
		System.out.println("C = " + c);
		System.out.println("D = " + d);
	}

	public int getC(){return c;}
	public int getD(){return d;}
}


class SigleInheritance1
{
	public static void main(String[] args) {

		/*Base b = new Base();
		b.bShow();*/
		Derrived d = new Derrived();
		d.bSetVal(12,21);
		d.dSetVal(32,12);
		d.dShow();

	}
}