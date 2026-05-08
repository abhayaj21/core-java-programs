class Rectangle
{
	private int len;
	private int wid;

	public void show()
	{
		System.out.println("Length = " + len);
		System.out.println("Width = " + wid);
	}

	public void setValue(int len, int wid)
	{
		this.len = len;
		this.wid = wid;
	}

	public void sum(Rectangle a, Rectangle b)
	{
		len = a.len + b.len;
		wid = b.wid + b.wid;
	}
}
class ObjectAsArgument
{
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		Rectangle c = new Rectangle();

		a.setValue(10,20);
		System.out.println("\nRectangle A Info");
		a.show();

		b.setValue(12,20);
		System.out.println("\nRectangle A Info");
		b.show();

		c.sum(a,b);
		System.out.println("\nAdditon of A and B Rectangle");
		c.show();
	}
}