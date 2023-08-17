package days25;

import java.io.File;
import java.io.FileWriter;
import java.util.Properties;

public class Ex07_02 {

	public static void main(String[] args) {
		// 실행 후
		// 1. 저장할 파일명 입력?   heejin.txt  엔터
		// 2. 저장할 문자열(Data) 입력?   내일은 금요일  엔터
		//    계속?
		//    저장할 문자열(Data) 입력?   오늘은 목요일  엔터
		//    계속? n
		
		// [ 파일 저장 ]
		
		String path = System.getProperty("user.dir");
        System.out.println("현재 작업 경로: " + path);
        
		String pathname = ".\\Education\\Java\\days25\\sample.txt";
		File file = new File(pathname);
		// 파일의 존재 유무를 true, false 반환
		// System.out.println( file.exists() );
		
		// 파일 + 문자 출력용 스트림
		// fw.close()는 try catch문을 사용함으로써 코딩하지 않아도 됨
		// fw.close()가 실행되면 fw.flush가 일어남
		//										boolean append : true(뒤에 추가) / false(덮어쓰기)
		try (FileWriter fw = new FileWriter(file, false)) {
			// append는 Witer 객체를 반환함
			/*
			fw.append('a')
			  .append("append_string");
			
			// write는 반환하는 것이 없음
			fw.write(98);
			fw.write("write_string");
			*/
			
			fw.write("새로 실행해서 텍스트 추가");
			// 쓰기 + 추가  fr 출력용 스트림에 쓰기+추가 됨
			// 파일에 저장하고 스트림을 비움
			fw.flush();
			
			System.out.println("End");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} //main

} //class