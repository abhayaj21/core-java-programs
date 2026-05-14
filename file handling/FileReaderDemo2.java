import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileReaderDemo2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter File to Reade Data: ");
		String fileName = sc.next();

		try(FileReader reader = new FileReader(fileName))
		{
			int read = 0;
			while(read != -1)
			{
				read = reader.read();
				System.out.print((char)read);
			}
		}catch (FileNotFoundException e) {
			System.out.println(fileName + "File Not Found");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}