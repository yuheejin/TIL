package days23;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author kenik
 * @date 2023. 8. 14. - 오후 5:06:35
 * @subject
 * @content
 */
public class Ex10 {
	
	public static void main(String[] args) {
		/*
		[Properties 컬렉션 클래스]
	    == Hashtable 컬렉션 클래스
	    - Map
	    - Hashtable<String,String> == Properties
	    - key,value : String
	    
	    - 환경설정값들을 Properties 클래스 사용해서 쓰기/읽기
		*/
		
		// 오라클  +  Java 연동 ( DB연결 설정 정보 )
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";	
		
		Properties p = new Properties();
		// put(key,value)
		// p.put(Object key, Object value);
		// p.setProperty(String key, Strng value);
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		// p.get(Object key)
		/*
		String value =  p.getProperty("className");
		System.out.println( value );
		*/
		
		// ???.properties 확장자.
		String fileName = ".\\src\\com\\util\\jdbc.properties";
		String comments = "jdbc configuration";
		try ( FileWriter writer = new FileWriter(fileName)) {
			p.store(writer, comments);
			System.out.println(" Save End. ");
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		
		
		
		
	} // main

} // class





