package ex02_Wrapper;

import java.util.Iterator;

public class StringTest2 {

	public static void main(String[] args) {
		//+와 append의 차이
		//불변과 가변클래스의 차이
		//버퍼와 빌더
		
		//+
		long startTime1 = System.currentTimeMillis();
		
		String data1 = "";
		for (int i = 0; i <10000; i++) {
			data1+=i;
		}
		
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("소요시간: "+ (endTime1-startTime1)); 
		
		///빌더
		long startTime2 = System.currentTimeMillis();
		
		
		StringBuilder data2 = new StringBuilder();
		
		for (int i = 0; i < 10000; i++) {
			data2.append(i);
		}
		
		long endTime2 = System.currentTimeMillis();
		System.out.println("소요시간: "+ (endTime2-startTime2)); 
	}
}
