package lesson4;

public class Dae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**int num01 = 15;
		long lyNum01 = 20;
		byte byNum01 = 0;
		
		//자동형변환
		lyNum01 = num01; 
		//강제형변환
		byNum01 = (byte)num01;
		
		int num02 = 130;
		byte byNum02 = 0;
		
		byNum02 = (byte)num02;
		
		System.out.println("형변환1 int-->iong" + lyNum01);
		System.out.println("형변환2 int-->byte" + byNum01);
		System.out.println("형변환3 int-->byte" + byNum02);*/

		char ch = 'E' ;
		int num = 90;
		
		int chToNum = 0;
		char intToch = ' ';
		
		chToNum = ch;
		intToch = (char) num;
	//char-> int 는 자동형변환 O , int -> char 은 강제형변환 // int가 char 보다 큼
	
		System.out.println(chToNum);
		System.out.println(intToch);

		
		
		
}}
	
	
