package IObytes;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExam2 {

	public static void main(String[] args) {
		FileInputStream in= null;
		try {
		in = new FileInputStream("C:\\Users\\lye36\\Desktop\\coding\\JAVA\\workspace\\14\\src\\test.txt");
		
		int read = 0;
		byte[] buffer = new byte[50];
		//read(byte[] arr)은 리턴으로 읽은 개수
		while((read= in.read(buffer)) != -1) {
			//System.out.write(buffer, 0 , read); //배열 단위로 가져오기에 한글도 출력가능, 성능적으로도 우수
			System.out.print(new String(buffer,0,read));//배열.length를 하면 배열에 값이 이미 채워졌기에 사용할때마다 초기화해야함.. read가 간편
		}
		
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			if( in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
