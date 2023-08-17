package days25;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Ex07 {

	public static void main(String[] args) {
		// 상대경로

		// File 클래스 : 파일, 폴더(디렉토리)를 다루는 클래스
		//				생성, 이름변경, 삭제, 정보 얻어오기 등
		// 상대경로		
		String pathname = ".\\src\\days25\\Ex01.java";
		// File 클래스 : 파일, 폴더(디렉토리)를 다루는 클래스
		//            다루다? 생성,이름변경, 삭제 , 정보 얻어오고 등등
		File file = new File(pathname);

		// 파일크기
		System.out.println( file.isDirectory() ); // false
		System.out.println( file.isFile() );      // true	    
		long fileLength =  file.length();
		System.out.printf("> 파일 크기 : %d(bytes)\n", fileLength);	    

		try( FileReader fr = new FileReader(file) ){

			/*
			fr.read();
			fr.read(char[] cbuf);
			fr.read(CharBuffer target);
			fr.read(char[] cbuf, int offset, int length);
			 */

			int code ;

			// 라인단위로 처리하는 보조스트림사용하면 라인번호 앞에 
			// 붙일 때 더 코딩이 편해질거다.
			while (  (code = fr.read()) != -1  ) {
				System.out.printf("%c", (char)code);
			} // while

		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	} // main

} // class
