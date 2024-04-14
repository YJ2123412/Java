package study.code.set;

public class TextMessage {

		private String msgNumber;
		private String message;
		
		public TextMessage(String msgNumber, String message) {
		//private는 내부에서도 get, set 이용 추천
			this.setMsgNumber(msgNumber);
			this.setMessage(message);
		}
		
		
		public String getMsgNumber() {
			return msgNumber;
		}
		public void setMsgNumber(String msgNumber) {
			this.msgNumber = msgNumber;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
		//hashCode 메서드 재정의
		@Override
		public int hashCode() {
			return this.getMsgNumber().hashCode();
		}
		
		//equals 메서드 재정의
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof TextMessage) {
				TextMessage compare = (TextMessage)obj;
				if(this.getMessage().equals(compare.getMessage())) {
					return true; //빠른 반환
				}
			}
			return false;
		}
	}

