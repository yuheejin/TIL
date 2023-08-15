package Education.Java.days08;

public class Ex10_02 {
	public static void main(String[] args) {

		String rrn = "830412-1700001";
		String[] rrnArray = rrn.split("-");
		
		// 830412-1******
		System.out.printf("%s-%c******\n", rrnArray[0],rrn.charAt(7));
		System.out.printf("%s-%c******\n", rrnArray[0],rrnArray[1].charAt(0));
		System.out.println( rrn.substring(0,8)+"******");
		
		// 830412-*******
		System.out.printf("%s-*******\n", rrnArray[0]);
		
	} //main
	
} //class