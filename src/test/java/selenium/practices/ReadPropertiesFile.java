package selenium.practices;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
	File file1 = new File("C:\\Users\\jkhar\\OneDrive\\Documents\\CodeMind notes.txt");
		File file2= new File("C:\\Users\\jkhar\\OneDrive\\Desktop\\NewTextFile.txt");
	if (!(file1.exists())) {
		file1.createNewFile();
	}
	System.out.println(file1.getAbsoluteFile());
	String s ="Notes : ";
	FileWriter filewriter= new FileWriter(file2, true);
	filewriter.append(s);
	filewriter.close();
	
	System.out.println(file1.getName());
	System.out.println(file2.getName());
	System.out.println(file1.getAbsolutePath());
	System.out.println(file2.getAbsolutePath());
	System.out.println(file1.canExecute());
	System.out.println(file2.hashCode());
	FileReader fr= new FileReader(file1);
	/*// Declaring loop variable
			long i;
			// Holds true till there is nothing to read
			while ((i = fr.transferTo(filewriter)) != -1) {

				// Print all the content of a file
				System.out.print((char) i);
			}
			fr.close();
			
			file2=new File("C:\\\\Users\\\\jkhar\\\\OneDrive\\\\Documents\\\\CodeMind notes.txt");
			file2.createNewFile();*/
	}

}
