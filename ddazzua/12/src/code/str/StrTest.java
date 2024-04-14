package code.str;

public class StrTest {
	public static void main (String[] args){
		StringBuilder sb = new StringBuilder();
		sb.append("안녕하세요 "); //append 이전 문장 뒤에 붙는다. 
		sb.append("만나서 반갑습니다");
		
		sb.insert(4, "안녕하세요");//원하는 위치 삽입시-> 앞문장과 연속성 있어야 함. 공백 있으면 x
		System.out.println(sb);
		System.out.println(sb);
		
		//삭제 기능 - delete(int start, int end); start <= x < end
		sb.delete(0, 3);
		System.out.println(sb);
		System.out.println(sb.reverse());//거꾸로 출력
		sb.insert(11, "안녕하세요");//
	}
}
