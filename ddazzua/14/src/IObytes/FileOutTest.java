package IObytes;

import java.io.FileOutputStream;

public class FileOutTest {

	public static void main(String[] args) {
		
		
		FileOutputStream out = null;
		try {
			//이어쓰기(true)는 기존파일이 있다면, 이어쓰기. 없다면 새로생성
			//이어쓰기(false)는 기존파일이 있다면, 덮어쓰기. 없다면 새로생성
			out = new FileOutputStream("Write.txt",false);
			
			//write(int val)은 단일 값만 가능
			out.write(97);
			out.write('B');
			out.write('C');
			out.write('\n');
			
			String str= "문장을 출력합니다";
			byte[] strArray =str.getBytes();
			
			out.write(strArray);
			System.out.println("파일 생성 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			
			}
		}

	}
}
