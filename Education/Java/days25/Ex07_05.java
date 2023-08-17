package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @subject 실행파일(exe, dll, mp4 등) 복사
 * 			바이트 스트림
 *			FileInputStream
 *			FileOutputStream
 *
 *			BufferedInputStream
 *			BufferedOutputStream
 */

public class Ex07_05 {
	public static void main(String[] args) {
		// [ 파일 복사 ]
		String pathname = "C:\\Program Files (x86)\\Kakao\\KakaoTalk\\KakaoTalk.exe";
		String copyPathname = "C:\\Users\\user\\Documents\\KakaoTalk_copy.exe";
		
		// fileCopy_byteStream(pathname, copyPathname);
		fileCopy_byteStream02(pathname, copyPathname);
		
		
	} //main

	private static boolean fileCopy_byteStream02(String pathname, String copyPathname) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		try (FileInputStream fis = new FileInputStream(pathname);
			 FileOutputStream fos = new FileOutputStream(copyPathname, true);
				// 버퍼 기능 + 보조 스트림 사용해서 파일 복사
				 BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
				 BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE)) {
			
			byte[] b = new byte[BUFFER_SIZE];
			int readByteNumber = 0;
			while ( (bis.read(b)) != -1) {
				bos.write(b, 0, readByteNumber);
			}
			
			bos.flush();
			System.out.println( "파일 복사 완료!!!" );

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", end-start);
			return true;
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		return false;
	}
	
	private static boolean fileCopy_byteStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
		
		try (FileInputStream fis = new FileInputStream(pathname);
			 FileOutputStream fos = new FileOutputStream(copyPathname, true)) {
			
			int b;
			while ((b=fis.read()) != -1) {
				fos.write(b);
			}
			
			System.out.println( "파일 복사 완료!!!" );

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", end-start);
			return true;
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		return false;
	}

} //class