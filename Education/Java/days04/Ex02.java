package Education.Java.days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// String.trim()		앞뒤 공백을 제거하는 메소드, 매개변수 없음, 리턴값 : 공백을 제거한 문자열
		String sKor = " 90   ";
		int kor = Integer.parseInt(sKor.trim());
		System.out.printf("kor= %d\n",kor);
		
	}//main

}//class
