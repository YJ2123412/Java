package IOBuffer;

import java.awt.image.DataBufferDouble;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		BufferedInputStream bin = null;
		FileOutputStream out = null;
		BufferedOutputStream bout= null;
		
		try {
			in = new FileInputStream("C:\\Users\\lye36\\Desktop\\coding\\html+css\\img\\cute3.jpg");
			bin = new BufferedInputStream(in);
			out = new FileOutputStream("C:\\\\Users\\\\lye36\\\\Desktop\\\\coding\\\\html+css\\\\img\\cute3_copy.jpg", false);
			bout = new BufferedOutputStream(out);
			long start = System.currentTimeMillis();//시간을 1000분의 1초 단위로 표시
			System.out.println("이미지 읽기 시작");
			
			
			int read = 0;
			while((read = bin.read()) != -1) {
				bout.write(read);
			}
			System.out.println("이미지 복사 시작");
			long end = System.currentTimeMillis();//시간을 1000분의 1초 단위로 표시
			
			double time = (double)(end- start)/1000;
			System.out.println("걸린시간 :"+time);
			
		} catch (Exception e) {
		} finally {
			try {
				if(out != null) {
					out.close();
				}if(bout != null) {
					bout.close();
					}
				if(in != null) {
					in.close();
				}
				if(bin != null) {
					bin.close();
				}
			} catch (Exception e2) {
			}
		}
	}
}
