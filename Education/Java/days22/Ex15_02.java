package Education.Java.days22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ex15_02 {
	public static void main(String[] args) {
		/*
		게임횟수를 입력받아 로또 번호를 출력하는 코딩을 하세요 . 
        게임 횟수 입력 ? 3
      
        		1게임 : [17][9][4][15][16][38]   
        		2게임 : [17][9][4][15][16][38]   
        		3게임 : [17][9][4][15][16][38]   
		*/
		
		System.out.print( "게임 횟수 입력?  " );
		Scanner scanner = new Scanner(System.in);
		int gameCount = scanner.nextInt();
		scanner.close();
		
		ArrayList lottos = new ArrayList();
		LinkedHashSet lotto;
		for (int i = 0; i < gameCount; i++) {
			lotto = new LinkedHashSet();
			Ex15.fillLotto(lotto);
			
			/*
			System.out.printf( "%d게임 : ", i+1 );
			Ex15.dispLotto(lotto);
			System.out.println();
			*/
			
			lottos.add( lotto );
		} // for

		dispLotto(lottos);
	} //main

	private static void dispLotto(ArrayList lottos) {
		Iterator it = lottos.iterator();
		int n=1;
		while (it.hasNext()) {
			LinkedHashSet lotto = (LinkedHashSet) it.next();
			System.out.printf( "%d게임 : ", n++ );
			Ex15.dispLotto(lotto);
			System.out.println();
		} //while
	}

} //class