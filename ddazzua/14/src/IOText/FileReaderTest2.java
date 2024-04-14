package IOText;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest2 {

	public static void main(String[] args) {
		FileReader re = null;
		
		try {
		
			re = new FileReader("C:\\Users\\lye36\\Desktop\\coding\\JAVA\\workspace\\14\\src\\IOText\\test.txt");

			int read = 0;
			while((read = re.read())!= -1){
				System.out.print((char)read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
