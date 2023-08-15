package Education.Java.days18;

public class Ex08_02 {
	public static void main(String[] args) {
		//
		String dir = System.getProperty("user.dir");
		System.out.println( dir );		// "E:\CLASS\Workspace\JavaClass\javaPro"
		
		String sep = System.getProperty("file.separator");	// \\
		
		String directory = "C:\\temp\\days09\\";
		String fileName = "Ex01.java";
		// String path = directory + ( directory.substring(directory.length()-1).equals("\\")? "" : "\\" ) + fileName;
		// String path = directory + ( directory.endsWith("\\")? "" : "\\" ) + fileName;
		String path = directory + ( directory.endsWith(sep)? "" : "\\" ) + fileName;
		System.out.println( path );
		
		
		
	} //main
	
} //class