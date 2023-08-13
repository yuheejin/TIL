package Education.Java.days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex07_02 {
	public static void main(String[] args) {		
		
		String strMoney = "1,234,567";
		// [1]
		// int money = Integer.parseInt( strMoney.replace(",", "") );
		
		// [2]
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat( pattern );
		int money;
		try {
			Number num = df.parse(strMoney);
			money = num.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	} //main
} //class