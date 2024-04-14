package toChange;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StreamRaederTest {

	public static void main(String[] args) {
		FileInputStream in =null;
		InputStreamReader is = null;
		
		try {
			
			in = new FileInputStream("C:\\Users\\lye36\\Desktop\\coding\\JAVA\\workspace\\14\\src\\IOText\\test.txt");
			//인코딩 설정
			//파일이 생성할 때 사용한 인코딩과 같아야 함, 인코딩을 기입하지 않으면 system에 따름
			is = new InputStreamReader(in);
			
			int read = 0;
			while ((read = is.read()) !=-1) {
				System.out.print((char)read);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
