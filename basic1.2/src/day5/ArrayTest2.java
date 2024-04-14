package day5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		//실습
		//double 타입의 2칸짜리 배열 
		//char 타입의 3칸짜리 배열
		//STring 타입의 2칸짜리 배열
		//boolean 타입의 3칸짜리 배열
		//각각 선언 및 반복문을 통해 출력
		
		
		
		
		//double 타입의 2칸짜리 배열 
		double[] arDouble = new double[2];
		for (int i = 0; i < arDouble.length; i++) {
			System.out.print("arDouble: "+arDouble[i]+"\t");
		}
		
		//char 타입의 3칸짜리 배열
		char[] arChar = new char[3];
		for (int i = 0; i < arChar.length; i++) {
			System.out.print("\n"+"arChar: "+arChar[i]+"\t");
		}
		
		//STring 타입의 2칸짜리 배열
		String[] arStr = new String[2];
		for (int i = 0; i < arStr.length; i++) {
			System.out.print("\n"+"arStr: "+arStr[i]+"\t");
		}
		
		//boolean 타입의 3칸짜리 배열
		boolean[] arBool = new boolean[3];
		for (int i = 0; i < arBool.length; i++) {
			System.out.print("\n"+"arBool: "+arBool[i]+"\t");
		}
		
		//각각 선언 및 반복문을 통해 출력
				
		System.out.println("----------------------------------------");
		
		
		//각각의 배열에 지정한 값을 저장하기
		//arDouble  - 인덱스번호 * 1.1
		//arChar -> 'A'
		//arString -> 인텍스 번호+!
		//arBool -> true
		
		for (int i = 0; i < arDouble.length; i++) {
			arDouble[i] = (i*1.1);
			}
		System.out.println(Arrays.toString(arDouble));
		for (int i = 0; i < arChar.length; i++) {
			arChar[i] = 'A';
		}
		System.out.println(Arrays.toString(arChar));
		for (int i = 0; i < arStr.length; i++) {
			arStr[i]= i+"!";
		}
		System.out.println(Arrays.toString(arStr));
		for (int i = 0; i < arBool.length; i++) {
			arBool[i] = true;
		}
		System.out.println(Arrays.toString(arBool));
		
		//---------------------
		
		
		//실습1
		//사용자에게 양의 정수 3개를 입력받기(1개씩 입력받는다) ->누적입력 3번씩 종료
		//음수 입력시 음의정수를 입력하였습니다. 출력하고 다시 입력받기
		//누적된 양의 정수 개수가 3개가 아니라면 다시 입력받기
		//누적된 양의 정수를 출력한 뒤 프로그램 종료 출력하기
	}
	}
