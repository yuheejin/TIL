package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {
		
		String fileName = "D:\\git\\TIL\\Education\\Java\\days19\\1. Java 팀 구성.txt";
		String content = "";
		StringBuilder sb = new StringBuilder();
		String line = null;
		
		ArrayList<Member> teamList = null;
		HashMap<String, ArrayList<Member>> team = new HashMap<>();
		
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)){
			while( (line = br.readLine()) != null ) {
				sb.append(line + "\r\n");
			} // while
			content = sb.toString();
			// System.out.println( content );
			
			/*
			String pattern = "{0}\r\n{1}\r\n"
					+ "{2}\r\n{3}\r\n"
					+ "{4}\r\n{5}\r\n";
			*/
			
			String pattern = "{0}\r\n{1}(팀장),{2}\r\n";
			
			MessageFormat mf = new MessageFormat(pattern);
			Object[] datas = mf.parse(content);
			
						
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		
		
	} //main

} //class