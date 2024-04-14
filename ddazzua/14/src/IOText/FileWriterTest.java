package IOText;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("test23.txt",false);
			
			fw.write("안녕하세요, 날씨가 더워요");
			fw.write("비는 싫어요");
			fw.write("Have a good day");
			//fw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) { 
					fw.close(); //close에 auto flush 기능 탑재.. ->buffer에서 내려서 실제 파일에 작성하는 기능
				}
			} catch (Exception e) {
			}
		}
	}
}
