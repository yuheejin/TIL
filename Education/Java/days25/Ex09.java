package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		// 본인의 이름을 입력받아서 출력
		/*
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println(name);
		*/
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> name input?  ");
		String name = br.readLine();
		System.out.println(name);
		*/
		
		// 1. 키보드(표준입력장치)로 부터 입력 -> 표준 입력 스트림 (System.in)
		// System.in : byte Stream
  		InputStream is = System.in;
  		// System.out.print("> 한글 한 문자 입력?  ");
  		InputStreamReader isr = new InputStreamReader(is);
  		// int code = isr.read();
  		// System.out.println((char)code);
		
  		System.out.print("> 한글 문자열 입력?  ");
  		BufferedReader br = new BufferedReader(isr);
  		String line = br.readLine();
  		System.out.println(line);
  		
  		/*
  		int code;
  		System.out.print("> name input?  ");
  		code = is.read();	// 1바이트(0~255 정수 int) 반환하는 메서드
  		System.out.println( (char)code ); //"홍"
		*/
  		
  		/*
  		byte[] cbuf = new byte[3];
  		System.out.print("> name input?  ");
  		is.read(cbuf);
  		// byte [] cbuf -> char one 변환
  		*/
  		
  		// InputStream[Reader] 보조 문자스트림
  		// byte -> char 변환해주는 보조 스트림
  		
  		// Buffered[Reader] buffer기능이 있는 보조 스트림
  		// char -> String
  		
	} //main

} //class