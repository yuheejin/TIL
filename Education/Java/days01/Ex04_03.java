<<<<<<< HEAD
package days01;

public class Ex04_03 {
	
	public static void main(String[] args) {
		
		String name;
		int age;
		
		name = "이준희";
		age = 25;		
		age = age - 2;

		// Ctrl + Alt + 방향키
		System.out.println(name);
		System.out.println(age);
		
		//  (출력형식)
		//  이름은 "이준희"이고, 나이는 '23살'입니다. 
		// + ------------------------------>
		// The left-hand side of an assignment must be a variable
		System.out.println("이름은 \""+name +"\"이고,\n 나이는 \'"+age +"살\'입니다.");
		
		// System.out.printf("출력형식문자열",   출력할값,출력할값,출력할값,...);
		//                         format == 출력형식
		// name 문자열 출력할 때  출력서식  : %s
		// age 정수 출력할 때  출력서식  : %d
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d살'입니다.", name, age);
		
	} // main

} // class




=======
package Education.Java.days01;

public class Ex04_03 {
	public static void main(String[] args) {
		
		String name = "유희진";
		int age = 27;
		
		age = age -2;
		// age -= 2;
		
		System.out.println(name);
		System.out.println(age);
		
		// (출력형식) 이름은 유희진이고, 나이는 25살입니다.
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "살입니다.");
		
		// (출력형식) 이름은 "유희진"이고, 나이는 '25'살입니다.
		System.out.println("이름은 \"" + name + "\"이고, \n나이는 '" + age + "살'입니다.");
		
		//System.out.printf("출력형식문자열", 출력할 값, 출력할 값, 출력할 값, ...);
		//						format == 출력형식
		//name 문자열 출력할 때 출력서식 : %s
		//age 정수 출력할 때 출력서식 : %d
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살입니다.", name, age);
		
	} //main
} //class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
