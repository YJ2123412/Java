package study.code.set;

import java.util.HashSet;
import java.util.Set;

public class TextMain {

	public static void main(String[] args) {
			
		
		TextMessage msg1 = new TextMessage("1001", "좋은 아침");
		TextMessage msg2 = new TextMessage("1001", "좋은 아침");
		TextMessage msg3 = new TextMessage("1002", "잘자요~");
		
		
		Set<TextMessage> txSet = new HashSet<>();
		
		txSet.add(msg1);
		txSet.add(msg2);
		txSet.add(msg3);
		
		System.out.println("set 사이즈: "+ txSet.size());
		
		//향상된 for 문 으로 출력
		for(TextMessage msg : txSet) {
			System.out.println("메시지 번호: " +msg.getMsgNumber());
			System.out.println("메시지 내용: " );
			System.out.println(" " +msg.getMessage());
			System.out.println("============");
			
		}
		
		
		
		
	}

}
