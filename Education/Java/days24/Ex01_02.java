package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01_02 {

	public static void main(String[] args) {
		
		String fileName = "D:\\git\\TIL\\Education\\Java\\days19\\1. Java 팀 구성.txt";
		String line = null;
		String teamName = null;	// key
		MemberVO memberVO = null;
		ArrayList<MemberVO> teamList = null;
		LinkedHashMap<String, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();
		
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)){
			String [] tNames;
			while( (line = br.readLine()) != null && !line.equals("")) {
				teamName = line;	// key
				line = br.readLine();
				tNames = line.split("\\s*,\\s*");
				teamList = new ArrayList<MemberVO>();
				for (String tName : tNames) {
					if (tName.contains("(팀장)")) {
						tName = tName.replace("(팀장)", "");
						memberVO = new MemberVO(tName, "팀장");
					} else {
						memberVO = new MemberVO(tName, "팀원");
					}
					teamList.add(memberVO);
				} //foreach
				
				teamMap.put(teamName, teamList);
			} //while
			
			dispTeamMember(teamMap);
						
		} catch (Exception e) {
			e.printStackTrace();
		} //catch
		
	} //main

	
	private static void dispTeamMember(LinkedHashMap<String, ArrayList<MemberVO>> teamMap) {
		Set<Entry<String, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<String, ArrayList<MemberVO>>> ir = eset.iterator();
		
		Entry<String, ArrayList<MemberVO>> entry=null;
		String teamName = null;
		ArrayList<MemberVO> teamList = null;
		int teamCount = 0;
		MemberVO teamLeaderVO = null;
		String teamLeaderName = null;
		
		Iterator<MemberVO> ir2=null;
		int count = 1;
		
		while (ir.hasNext()) {
			entry = (Entry<String, ArrayList<MemberVO>>) ir.next();
			teamName = entry.getKey();
			teamList = entry.getValue();
			teamCount = teamList.size();
			teamLeaderVO = teamList.get(0);
			teamLeaderName = teamLeaderVO.getName();
			System.out.printf("[%s(%d명):%s]\n", teamName, teamCount, teamLeaderName);
			
			// 팀원들 출력
			count = 1;
			ir2 = teamList.iterator();
			ir2.next();  //팀장 제거
			while (ir2.hasNext()) {
				MemberVO memberVO = (MemberVO) ir2.next();
				System.out.printf("  [%d] %s\n", count++, memberVO.getName());
			}
		}
		
	}

} //class