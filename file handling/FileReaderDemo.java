import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo
{
	public static void main(String[] args) {
		String file = "java.txt";
		try(FileReader reader = new FileReader(file))	
		{
			int read = 0;
			do{
				read = reader.read();
				System.out.print((char)read);

			}while(read != -1);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}