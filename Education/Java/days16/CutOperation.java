package Education.Java.days16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class CutOperation {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 막대기 수, 막대기 길이 입력
			System.out.print("> 몇개의 막대기를 입력하겠습니까?  ");
			int n = scanner.nextInt();
			System.out.printf("> 막대기의 길이를 %d개 입력하세요.(공백구분)  ", n);
			String[] input = scanner.next().split(" ");
			
			
			int[] stickArray = new int [input.length];
			for (int i = 0; i < input.length; i++) {
				stickArray[i] = Integer.parseInt(input[i]);				
			} // for

			// 막대기 길이 정렬
			Arrays.sort(stickArray);
			
			// 막대기가 없어질 때까지 cut
			int lastMinIndex;
			while (stickArray.length != 0) {
				lastMinIndex = 0;
				for (int i = 0; i < stickArray.length; i++) {
					if (stickArray[0] != stickArray[i]) {
						lastMinIndex = i;
						break;
					} //if
				} // for
				
				stickArray = Arrays.copyOfRange(stickArray, lastMinIndex, stickArray.length);
			} //while
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} //try-catch
		
	} //main
} //class