class Student
{
	private String name;
	private int roll;
	Test t1 = new Test();

	public void setName(String name)
	{
		this.name = name;
	}

	public void setRoll(int roll)
	{
		this.roll = roll;
	}

	class Test
	{
		private int marks;

		public void setMarks(int marks)
		{
			this.marks = marks;
		}

		public void show()
		{
			System.out.println("Student Name: " + name);
			System.out.println("Roll = " + roll);
			System.out.println("Marks = " + marks);
		}
	}
}

class InnerClasses
{
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Abhay");
		s1.setRoll(21);
		s1.t1.setMarks(56);
		s1.t1.show();


	}
}