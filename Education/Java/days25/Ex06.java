package days25;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Ex06 {

	public static void main(String[] args) {
		// [ Properties 컬렉션 클래스 ]
		// hashtable<String, String> + load()/store()
		// 환경설정

		// [ days23.Ex10.java ]
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";	

		Properties p = new Properties();
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);

		String fileName = "D:\\git\\TIL\\Education\\Java\\days25\\jdbcproperties.xml";
		String comments = "jdbc configuration";
		//try ( FileWriter writer = new FileWriter(fileName)) {
			// p.store(writer, comments);
		try ( FileOutputStream os = new FileOutputStream(fileName)) {
			p.storeToXML(os, comments);
			System.out.println(" Save End. ");
		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	} //main

} //class