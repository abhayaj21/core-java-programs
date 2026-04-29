class FibonaciiSeries10
{
	public static void main(String[] args) {

		int firstTearm = 0;
		int secondTearm = 1;

		for(int i = 1; i <= 10; i++)
		{
			System.out.println(firstTearm);
			int sum = firstTearm + secondTearm;
			firstTearm = secondTearm;
			secondTearm = sum;
		}
	}
}