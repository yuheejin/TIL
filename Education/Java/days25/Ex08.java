package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		// [ 메모리 스트림 ]
		// - 주로 다른 곳에 입,출력하기 전에
		//   메모리 상에 데이터를 임시로 저장할 목적으로 사용하는 스트림
		//
		// - Byte		ByteArrayInputStream / ByteArrayOutputStream
		//   Char		CharArrayReader / CharArrayWriter
		//   String		StringReader / StringWriter
		
		byte [] buf = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		// byte[] -> ByteArrayInputStream -> 읽기 -> ByteArrayOutputStream -> byte[] 쓰기
		
		// 읽기(입력용) 메모리 바이트 스트림
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		// 쓰기(출력용) 메모리 바이트 스트림
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int code;
		while ( (code = bais.read()) != -1 ) {
			System.out.println( code );
			baos.write(code);
		}
		byte[] outbuf = baos.toByteArray();
		System.out.println(Arrays.toString(outbuf));
		
		bais.close();
		baos.close();
	} //main

} //class