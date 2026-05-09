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


class Sub extends Derrived
{
	protected int e;
	protected int f;

	public void sSetVal(int e, int f)
	{
		this.e = e;
		this.f = f;
	}

	public Sub()
	{
		System.out.println("Sub Constructor");
	}

	public void sShow()
	{
		dShow();
		System.out.println("E = " + e);
		System.out.println("F = " + f);
	}

	public int getE(){return e;}
	public int getF(){return f;}
}

class MultilevelInheritance1
{
	public static void main(String[] args) {

		Sub s = new Sub();
		s.bSetVal(12,32);
		s.dSetVal(32,54);
		s.sSetVal(90,87);
		s.sShow();

	}
}