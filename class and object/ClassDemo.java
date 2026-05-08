class Rectagnle
{
	 int length;
	 int width;

	 public Rectagnle()
	 {

	 }

	 public Rectagnle(int lenwid)
	 {
	 	this.length = lenwid;
	 }

	 public Rectagnle(int len,int wid)
	 {
	 	this.length = len;
	 	this.width = wid;
	 }

	public int area()
	{
		return length * width;
	}
	public void show()
	{
		System.out.println("Length = " + length);
		System.out.println("Width = " + width);
		System.out.println("Area = " + area());
	}

	public void setLen(int len)
	{
		this.length = len;
	}

	public void setWid(int wid)
	{
		this.width = wid;
	}

	public int getLen()
	{
		return length;
	}
	public int getWid()
	{
		return width;
	}

}

class ClassDemo
{
	public static void main(String[] args) {
		Rectagnle r = new Rectagnle(10,24);
		r.show();
		r.setLen(22);
		r.show();
	}
}