package Education.Java.days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author heejin
 * @date 2023. 8. 10. - 오후 12:44:51
 * @subject	DateTimeFormatter 형식화 클래스
 * @content
 */
public class Ex11 {
	public static void main(String[] args) {
		// java.time 패키지    핵심 클래스 
		// 문자열 -> 파싱 -> 핵심 클래스
		// 		   <- 포맷 <- 
		// 				DateTimeFormatter 형식화클래스
		LocalDateTime dt = LocalDateTime.now();
		// 2023-08-10T14:04:43.836952700
		System.out.println( dt );
		
		// 2023/08/10 요일 시간:분:초.밀리세컨드
		// DateTimeFormatter dtf = new DateTimeFormatter(); X 
		String pattern = "yyyy/MM/dd E요일 hh:mm:ss.SSS";
        // DateTimeFormatter implements Temporal extends TemporalAccessor
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String output = dtf.format(dt);
		System.out.println( output );
		
				
	} //main
} //class