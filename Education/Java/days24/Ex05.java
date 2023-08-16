package days24;

class Ex05 {

	public static void main(String[] args) {
		Button btnTouch = new Button();
		btnTouch.setOnClickListener(new CallListener());
		btnTouch.touch();
		
		btnTouch.setOnClickListener(new MessageListener());
		btnTouch.touch();
		
	} //main
	
}//class

class Button {
	
	// 필드
	OnClickListener listener;
	// 의존성 주입(DI) - 생성자, setter
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		this.listener.onClick();
	}
	
	// 중첩 인터페이스
	// On~ : 대부분 이벤트를 나타낼때 On을 사용
	interface OnClickListener{
		void onClick();
	} //interface OnXXX
	
} //class Button


class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("전화를 건다.");
	}
} //class CallListener


class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메시지를 보낸다.");
	}
} //class MessageListener
