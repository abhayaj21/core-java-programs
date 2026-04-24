/*
Input From user Using BufferedReader
This Class Store in java io package
This class conatains two methods for input

read(),readLine Method

This Methods Are return data from string therefore we required to convert
it into appropriate data using warapper classes Integer.parse()

These method genereates an exception run time error threfore try-catch block is required

Two ways to create obj and use 

1. InputStreamReader in = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(in);

2. BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Rectangle
{
	public static void main(String[] args) throws IOException {
		int len,wid,area,para;
		//InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Length and Width of rectangle\n");
		System.out.print("Enter Length: ");
		len = Integer.parseInt(br.readLine());

		System.out.print("Enter Width: ");
		wid = Integer.parseInt(br.readLine());

		area = len * wid;
		para = 2 * (len + wid);

		System.out.println("Length = " + len);
		System.out.println("Width = " + wid);
		System.out.println("Area = " + area);
		System.out.println("Parameter = " + para);
	}
}