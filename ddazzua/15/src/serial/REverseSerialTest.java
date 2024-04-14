package serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class REverseSerialTest {

	public static void main(String[] args) {
		
		FileInputStream fs = null;
		ObjectInputStream io = null;
		
		try {
			fs = new FileInputStream("Object_data.txt"); //실제 파일 불러오기
			io = new ObjectInputStream(fs); //보조이기에 fs를 넣어야 함
			 
			while(fs.available() != 0) { //더이상 읽을 수 있는 것이 없을때까지
				Person p = (Person)io.readObject();
				System.out.println("이름: "+ p.getMyName()+ ", 나이: "+ p.getAge());
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
	
		} finally {
			try {
			if(fs != null) {
				fs.close();
			}
			if(io != null) {
				io.close();
			}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
