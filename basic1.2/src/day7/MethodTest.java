package day7;


	public class MethodTest {
		   
		   
		   void printData(int data) {
		      System.out.println("정수형 데이터 = " + data);
		   }
		   
		   void printData(String data) {
		      System.out.println("문자열 데이터 = " + data);
		   }
		   
		   void printData(boolean data) {
		      System.out.println("논리형 데이터 = " + data);
		   }
		   

		   public static void main(String[] args) {

		      
		      // 메소드 오버로딩 
		      
		      System.out.println(10);
		      System.out.println("hello");
		      System.out.println(true);
		      
		      MethodTest mt = new MethodTest();
		      
		      // 메소드 오버로딩으로 인해 하나의 메소드를 3번
		      // 호출하는것이 아니라 메소드 3개를 호출하는것
		      
		      mt.printData(10);
		      mt.printData("hello");
		      mt.printData(true);
		      
		   }

		}	


