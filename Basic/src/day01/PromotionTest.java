package day01;

public class PromotionTest {

	public static void main(String[] args) {
		
		//자동 형변환
		
		//int -> long
		long longVar = 3;
		
		//int -> float
		float floatVar2 =3; 
		
		//float -> double   f가 d로 알아서 바뀜
		double doubleVar = 10.7f;
		
		
		//문자형과 정수형
		//char -> int   ->아스키코드가 있기에 가능
		int intVar2 = 'A';
		
		//int -> char
		char carhCar = 65;
		System.out.println(intVar2);
		System.out.println(carhCar);
		
		
		/*저장공간이 작기에 큰걸 못넣음. 정보의 손실을 막기 위해서.. 
		 * int intVar =(long) 3; float floatVar = 3.9;
		*/
		
		//논리형 -> 다른 자료형으로 자동형변환 x 
		//int intVar3 =true;
		//char cahrVar2 = true;
		//String은 클래스이기에 형변환 x
		
		//오버플로우 - 자료형이 표현할 수 있는 최대범위보다 큰 수를 저장할때, 최솟값을 얻게 되는 현상 (int의 최솟값 =-2147483647)
		int num1=2147483647;
		//int num2=2147483648;  num+1이 되면 한계를 넘었기에 최솟값으로 돌아감
		long longnum=2147483648L;   // 강제형변환
		
		
		
		//언더플로우 - 자료형의 최소범위보다 작은값을 얻을때 최대값을 얻는 현상 (int의 최대값 = 2147483647)
		
		//넘어가면 서로 극단적으로감
		
		int num3 = -2147483648;
		//int num4 = -2147483649 
				System.out.println(num3-1);
		
		
		int mm = 
		
		
		
	}

}
