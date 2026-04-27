class DisplaySum10
{
	public static void main(String[] args) {
		int no,sum;
		no = 1;
		sum = 0;
		while(no <= 10)
		{
			sum = sum + no;
			System.out.print(no + " + "); 
			no++;
		}
		System.out.println("\b\b= " + sum);
	}
}