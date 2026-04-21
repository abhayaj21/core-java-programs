class CalPopOfTown
{
	public static void main(String[] args) {
		float totalpopulation,tmen,twomen,men,wom;
		totalpopulation = 30000;
		men = (float) 52/100;
		wom = (float) 48/100;
		tmen = totalpopulation * men;

		twomen = totalpopulation * wom;

		System.out.println("Total Population Of Town = " + totalpopulation);
		System.out.println("Total Men = " + (float)Math.round(tmen));
		System.out.println("Total Women = " + twomen);
	}
}