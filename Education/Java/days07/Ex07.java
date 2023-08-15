package Education.Java.days07;


public class Ex07 {
	public static void main(String[] args) {
		
		// 1. 1/2+2/3+3/4+...+8/9+9/10=??? 
		double sum=0;
		for (double i = 1; i < 10; i++) {
			sum += i/(i+1);
			System.out.printf( "%d/%d+",(int)i, (int)i+1 );
		} //for
		
		System.out.printf("\b=%1f",sum);
		
	} //main
} //class
