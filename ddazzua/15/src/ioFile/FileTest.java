package ioFile;

import java.io.File;
import java.io.FileOutputStream;

public class FileTest {
	public static void main(String[] args) {

		File f = new File("C:\\Users\\lye36\\Desktop\\coding\\JAVA\\workspace\\15\\src\\ioFile\\test.txt");
	
		if(f.exists()) {
			System.out.println("존재함");
		} else {
			System.out.println("존재하지 않음");
		}
	
		
		System.out.println("파일 크기: " + f.length()+"(byte)");
		System.out.println("파일 경로: "+ f.getPath());
		System.out.println("파일 절대 경로: "+ f.getAbsolutePath());
		System.out.println("파일 이름: "+ f.getName());
		System.out.println("파일? : "+ f.isFile());
		System.out.println("폴더?: "+ f.isDirectory());
		System.out.println("부모: " + f.getParent());
		
		
		//파일 만들기****
		File f2 = new File("C:\\Users\\lye36\\Desktop\\coding\\JAVA\\workspace\\15\\src\\ioFile\\tes.txt");
		//파일을 쓸 경우 , 폴더가 없으면 에러가 남. 만들어서 방지
		if(!f2.getParentFile().exists()) {
			f2.getParentFile().mkdirs();
		}
		FileOutputStream out =null;
		
		try {
			out = new FileOutputStream(f2);
			out.write('A');
			out.write('B');
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
			}
		}
		
	}
}
