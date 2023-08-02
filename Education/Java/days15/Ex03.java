package Education.Java.days15;

import Education.Java.days13.Tv;

public class Ex03 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 11;
		ctv.channelDown();
		System.out.println( ctv.channel );
		ctv.dispCaption("Hello Worls~");
		ctv.caption = true;		// 자막 ON
		ctv.dispCaption("Hi~");
		
	} //main
} //class


// 자막 Tv + 기존 Tv클래스
class CaptionTv extends Tv {
	boolean caption;	//자막 기능 on(true)/off(false)
	
	void dispCaption(String text) {
		if (this.caption) {
			System.out.println(text);
		} //if
	} //dispCaption
	
	
} //class CaptionTv