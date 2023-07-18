package Education.Java.days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(">  이름,국어,영어,수학 입력? ");
		
		String data = br.readLine();
		
		// 구분자 : 콤마(,), 공백( ) 같이 사용하고 싶은 경우
		// \s	A whitespace character: [ \t\n\x0B\f\r]
		// \S	A non-whitespace character: [^\s]
		// X*	X, zero or more times
		// , 앞과 뒤에 '\s' 공백이 '*' 몇개와도 상관이 없음
		// String regex = "\\s*,\\s*";
		
		// [abc]	a, b, or c (simple class)
		String regex = "[, ]";
		String [] datas = data.split(regex);
		
		name = datas[0];
		/*
		// 홍길동, 90    ,80 ,75
		// java.lang.NumberFormatException: For input string: " 90     "
		// 공백이 섞여있는 문자열을 입력 받았을때 나타나는 에러
		kor = Integer.parseInt(datas[1].trim());  // " 90    " <- 앞뒤 공백 제거해야함   Ex02
		eng = Integer.parseInt(datas[2].trim());
		mat = Integer.parseInt(datas[3].trim());
		*/
		
		// 홍길동 , 90   , 80 ,75 
		kor = Integer.parseInt(datas[1]);  // " 90    " <- 앞뒤 공백 제거해야함   Ex02
		eng = Integer.parseInt(datas[2]);
		mat = Integer.parseInt(datas[3]);
		
		int total = kor + eng + mat;
		double avg = (double)total/3;
		
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, mat, total, avg);
		
	}//main

}//class
