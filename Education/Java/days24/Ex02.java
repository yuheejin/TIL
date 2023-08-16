package days24;

import java.util.Enumeration;
import java.util.Properties;

class Ex02 {

	public static void main(String[] args) {
		// [ Properties 컬렉션클래스 ]
		// setProperty(), getPropertiy()
		
		// .  현재 디렉토리
		// .. 상위 디렉토리
		// 자바프로젝트명 = 기본폴더
		
		// key "user.dir"	value "D:\git\TIL"
		// String userDir = System.getProperty("user.dir");	
		// System.out.println( userDir );	//D:\git\TIL

		Properties sysProps = System.getProperties();
		Enumeration<Object> en = sysProps.keys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = System.getProperty(key);
			System.out.printf( "%s : %s\n", key, value );
		} //while
		
		
	} //main
	
} //class