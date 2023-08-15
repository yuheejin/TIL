package Education.Java.days22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class Ex15 {
	public static void main(String[] args) {
		// HashSet lotto = new HashSet();
		LinkedHashSet lotto = new LinkedHashSet();
		fillLotto(lotto);
		dispLotto(lotto);

	} //main

	
	public static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		int n;
		while (lotto.size() <= 6) {
			n = rnd.nextInt(45)+1;
			lotto.add(n);
		} //while
	}


	public static void dispLotto(HashSet lotto) {
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int lottonum = (int) ir.next();
			System.out.printf( "[%d]", lottonum );
		} //while
	}

} //class