import java.io.FileWriter;
import java.io.IOException;

class FileWriteDemo
{
	public static void main(String[] args) {
		String fileName = "java.txt";

		try(FileWriter write = new FileWriter(fileName))
		{
			write.write("This is my file handling Demo\n");
			write.write("This is best course of java\n");
			write.write("This is third line of file write");

			System.out.println("Create and wirte data successfully");
		}
		catch (IOException e) {
			e.printStackTrace();	
		}
	}
}