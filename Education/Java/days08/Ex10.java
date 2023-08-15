package Education.Java.days08;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		// 신용카드
		String card = "7655-8988-9234-5677";
		
		/*
		7655-****-9234-5677
		7655-8988-9234-****
		****-8988-9234-5677
		7655-8988-****-5677
		*/
		
		String[] cardNumber = card.split("-");
		int index = (int)(Math.random()*4);
		cardNumber[index] = "*".repeat(cardNumber[index].length());

//		for (int i = 0; i < cardNumber.length; i++) {
//			System.out.printf(i<cardNumber.length-1 ? "%s-":"%s",cardNumber[i]);
//		} //for
		
//		String printCard = String.format("%s-%s-%s-%s", cardNumber[0], cardNumber[1], cardNumber[2], cardNumber[3]);
		
		String printCard = String.join("-", cardNumber);
		System.out.println(printCard);
		
	} //main
	
} //class