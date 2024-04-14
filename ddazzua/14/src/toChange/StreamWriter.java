package toChange;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class StreamWriter {

	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter ow = null;
		
		try {
			
			out = new FileOutputStream("Stream.txt", true);
			ow = new OutputStreamWriter(out, "UTF-8");
			
			System.out.println("파일 생성 시작");
			
			String[] arr = {"안녕하세요2", "건강조심하세요2"};
			
			for(String str : arr) {
				ow.write(str+"\n");
			}
			System.out.println("파일 생성 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( ow!=null) {
					ow.close();
				}
				if(out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
