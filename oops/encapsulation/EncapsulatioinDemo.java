class Student
{
	private int roll;
	private String name;
	private int marks;

	public void setRoll(int roll)
	{
		this.roll = roll;
	}


	public void setName(String name)
	{
		this.name = name;
	}
	

	public void setMarks(int marks)
	{
		this.marks = marks;
	}

	public int getRoll(){ return this.roll;}
	public String getName(){ return this.name;}
	public int getMarks(){ return this.marks;}
}


class EncapsulatioinDemo
{
	public static void main(String[] args) {
	Student s = new Student();
	s.setRoll(10);
	s.setName("abhay");
	s.setMarks(90);

	System.out.println("Name  = " + s.getName());
	System.out.println("Roll  = " + s.getRoll());
	System.out.println("Marks = " + s.getMarks());
  }
}