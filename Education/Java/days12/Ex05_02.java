package Education.Java.days12;

/**
 * @author heejin
 * @date 2023. 7. 28. - 오후 2:45:12
 * @subject	"가변배열" 설명
 * @content
 */
public class Ex05_02 {
	public static void main(String[] args) {
		String [][] names = new String[3][];
		names[0] = new String[25];
		names[1] = new String[20];
		names[2] = new String[30];
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print("[]");
			} //for
			System.out.println();
		} //for
		
	} //main	
	
} //class