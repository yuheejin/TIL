package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days10.Ex06_04;

/**
 * @author kenik
 * @date 2023. 8. 14. - 오전 11:01:51
 * @subject  days12.Ex05.java
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		// 1반 30명
		ArrayList<Student> class1List = new ArrayList<>();
		ArrayList<Student> class2List = new ArrayList<>();
		ArrayList<Student> class3List = new ArrayList<>();
		
		ArrayList<ArrayList<Student>> sistList = new ArrayList<>();
		sistList.add(class1List); // class1List.size()
		sistList.add(class2List);
		sistList.add(class3List);
		
		char con = 'y';
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		int ban ;
		
		// 입력
		do { 
			System.out.printf("> 반 입력 ? ");
			ban = scanner.nextInt();    
			
			ArrayList<Student> classList = sistList.get(ban-1);
			
			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? ", ban , classList.size() + 1);
			
			int no = classList.size() + 1; 
			name = Ex06_04.getName();
			kor = Ex06_04.getScore();
			eng = Ex06_04.getScore();
			mat = Ex06_04.getScore();
			
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			wrank = rank = 1;
			
			Student s = new Student(no, name, kor, eng, mat, tot, avg, rank, wrank);
			classList.add(s);

			// 입력 계속 
			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while ( Character.toUpperCase(con) == 'Y' );

		// 출력
		/*
		 int totalStudents=0;
		 Iterator<ArrayList<Student>> ir = sistList.iterator();
	     while (ir.hasNext()) {
	          ArrayList<Student> classList = ir.next();          
	          totalStudents += classList.size();
	      } //while
	    System.out.printf("\t\t학생 정보 출력( %d명 )\n", totalStudents);
	    */  

		System.out.println("-".repeat(10));
		
		//sistList.stream().mapToInt(classList->classList.size()).forEach(학생수->System.out.println(학생수)); 
		
		//                           메서드참조
		//sistList.stream().mapToInt(ArrayList::size).forEach(  System.out::println);  
		
		// reduce()
		int totalStudents = sistList.stream().mapToInt(ArrayList::size).sum();
		System.out.printf("\t\t학생 정보 출력( %d명 )\n", totalStudents);
		
		System.out.println("-".repeat(10));
		
		Iterator<ArrayList<Student>> ir = sistList.iterator();
		ban = 1;
		while (ir.hasNext()) {
			ArrayList<Student> classList = ir.next(); 
			System.out.printf("[%d반 학생 : %d명 ]\n", ban++, classList.size());
			
			Iterator<Student> ir2 = classList.iterator();
			while (ir2.hasNext()) {
				Student s =  ir2.next();
				System.out.println( s );  // s.toString()
			} // while
			
		} // while
		
	} // main

} // class


/*
[1반 학생 : 3명 ]
1	혞졲댥	11	79	20	110	36.67	3	6
2	끌꽕쳮	55	63	36	154	51.33	2	5
3	쥗겢벐	61	85	69	215	71.67	1	3
[2반 학생 : 2명 ]
1	쉫웶뿫	93	69	35	197	65.67	2	4
2	끐햖뼱	95	67	85	247	82.33	1	1
[3반 학생 : 1명 ]
1	쫃쫾믬	90	40	90	220	73.33	1	2
*/






