package day04;

public class IfTest {

	public static void main(String[] args) {
		//if문
		int num = 0;
		if(num >0) {
			System.out.println("양수입니다.");
		} else {System.out.println("음수입니다");}
		
		boolean bool = false;
		if(bool) {
			System.out.println("bool 변수의 값이 트루이면 실행할 코드");
		}
		
		if(!bool) {
			System.out.println("bool 변수의 값이 false이면 실행할 코드");
		}
		if(bool ==false) {
			System.out.println("bool 변수의 값이 false이면 실행할 코드2");
		}
		
		
		String id = "min";
		if(id.equals("min1")){
			//아이디 변수의 문자열 괎과 min1문자 열이 값이 일치하면
			System.out.println("로그인 성공");
		} 
		if(!id.equals("min1")){
			//(!id.equals("min1")==false) 와 동일
			//아이디 변수의 문자열 값과 min1문자 열이 값이 일치하지 않으면
			System.out.println("로그인 실패");
			
		if(id.equals("min1")){
			System.out.println("로그인 성공");
		} else{
			System.out.println("로그인 실패");
		} 
		
		//if- else if문 
		if(num>0) {
			System.out.println("양수입니다.");
		} else if(num ==0){
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다");
		}
		
		//else의 특징 - 가장 가까운 if문에 붙음, 단독 사용 불가
		
		
		
		}
		
	}

}
