package Education.Java.days19;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

public class Ex03 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가";
		byte[] bArr = str.getBytes("UTF-8");	// 한글 한문자 : 3바이트 처리 인코딩
		printByteArr(bArr);	
		// "가" -> 3바이트 UTF-8 ->"가"	 : 디코딩
		String s = new String(bArr, "UTF-8");
		System.out.println(s);
		/*
		for (int i = 0; i < bArr.length; i++) {
			System.out.printf( "[%02x]:", bArr[i] );
		} // for
		System.out.println();
		*/
		
		bArr = str.getBytes("EUC-KR");		// 한글 한문자 : 2바이트 처리
		printByteArr(bArr);
	} //main
	
	private static void printByteArr(byte[] bArr) {
		
		StringJoiner sj = new StringJoiner(":", "[", "]");
		for (int i = 0; i < bArr.length; i++) {
			sj.add( String.format("%02x", bArr[i]) );
		} // for
		System.out.println(sj.toString());
		
	}
} //class