package st;


public class EventMain2 {
	
	public class Button{
		public ButtonClickListener listener;
		public void setListener(ButtonClickListener listener) {
			this.listener = listener;
		}
		public void click() {
			if(this.listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		EventMain2 main = new EventMain2();
		EventMain2.Button button = main.new Button();
		ButtonClickListener listener = new ButtonClickListener() {
			
			@Override
			public void click() {
				System.out.println("버튼이 눌렸습니다.");				
			}
		};
		
		button.setListener(listener);
		button.click();
	}
}
