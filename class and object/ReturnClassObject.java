class Rectangle
{
	private int len;
	private int wid;

	public void setValue(int len, int wid)
	{
		this.len = len;
		this.wid = wid;
	}

	public void show()
	{
		System.out.println("Length = " + len);
		System.out.println("wid = " + wid);
	}

	public Rectangle sum(Rectangle x)
	{
		Rectangle p = new Rectangle();
		p.len = x.len + len;
		p.wid = x.wid + wid;
		return p;
	}
}

class ReturnClassObject
{
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		Rectangle c = new Rectangle();

		a.setValue(10,22);
		System.out.println("Rectangle A");
		a.show();

		b.setValue(12,10);
		System.out.println("\nRectangle B");
		b.show();

		c = a.sum(b);
		System.out.println("\nRectangle C");
		c.show();
	}
}