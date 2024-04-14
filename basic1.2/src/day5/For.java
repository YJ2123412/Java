package day5;

public class For {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i%2== 0) {
				System.out.print(" 짝수 ");
			} else {System.out.print(i);}
		} System.out.println();
		for(int i=11; i<=20; i++) {
			if(i%2== 0) {
				System.out.print(" 짝수 ");
			} else {System.out.print(i);}
		}System.out.println();
		for(int i=21; i<=30; i++) {
			if(i%2== 0) {
				System.out.print(" 짝수 ");
			} else {System.out.print(i);}
		}System.out.println();
		for(int i=31; i<=40; i++) {
			if(i%2== 0) {
				System.out.print(" 짝수 ");
			} else {System.out.print(i);}
		}System.out.println();
		for(int i=41; i<=50; i++) {
			if(i%2== 0) {
				System.out.print(" 짝수 ");
			} else {System.out.print(i);}
		}System.out.println();
	System.out.println("---------------");
		
		//1부터 50까지의 수를 출력, 단 짝수의 경우 "짝수", 홀수의 경우는 정수로 출력
		//십단위로 줄바꿈을 해야한다. ->10의 배수일 경우에는 줄바꿈을 사용한다.
		//10단위의 정수가 아닐 경우에는 줄바꿈을 하지 않는다.
		
		for(int i = 1; i<50; i++) {
			if(i% 2==0) {
				System.out.print("짝수\t");
			} else {
				System.out.print(i+"\t");
			}
			
			if( i%10 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("---------------");
		for(int i = 1; i<=50; i++) {
			if (i%10 ==0) {
				System.out.print("짝수\n");
			} else if(i% 2==0) {
				System.out.print("짝수\t");
			} else {
				System.out.print(i+"\t");
		}
		
		
	}

	}}
