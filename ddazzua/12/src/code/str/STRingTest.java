package code.str;

public class STRingTest {

	public static void main(String[] args) {

		
		String str = "오늘은 비가 너무 많이 옵니다. 다들 비를 조심하세요.";
		System.out.println("문장의 길이: "+ str.length());
		System.out.println("문자위치 추출: "+ str.charAt(11));//해당위치 값
		System.out.println("해당 문자 위치: "+ str.indexOf("비"));
		System.out.println("해당 문자 마지막 위치: "+ str.lastIndexOf("비"));
		
		String str2 = "11오늘은 비22가 너무 많이 옵니다. 33다들 비를 조심하세요.";
		System.out.println(str2.replaceAll("[0-9]", ""));//[]는 범위, 뒤는 공백
		
		String str3="오늘은 날씨가 험하니 집에 일찍 귀가하세요.";
		System.out.println(str3.substring(11));//공백이 11, 12부터 출력
		System.out.println(str3.substring(0,10));//0부터 9까지.. 직전까지
	}

}
