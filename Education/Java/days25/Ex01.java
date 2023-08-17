package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		String fileName = "D:\\git\\TIL\\Education\\Java\\days19\\1. Java 팀 구성.txt";
		String line = null;

		TeamVO teamVO = null;
		ArrayList<MemberVO> memberVOArray = null;
		LinkedHashMap<TeamVO, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();

		String teamName = "";
		MemberVO teamLeader = null;
		int teamTotalNumber = 0;

		String[] memberNames;
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)) {
			while((line = br.readLine()) != null) {
				if (line.contains("조")) {
					teamName = line;
					line = br.readLine();
					memberNames = line.split("\\s*,\\s*");
					teamTotalNumber = memberNames.length;
					memberVOArray = new ArrayList<MemberVO>();
					for (String memberName : memberNames) {
						if (memberName.contains("(팀장)")) {
							teamLeader = new MemberVO(memberName.replace("(팀장)", ""));
						} else {
							memberVOArray.add(new MemberVO(memberName));
						} //if-else
					} //for
				} //if
				teamVO = new TeamVO(teamName, teamTotalNumber, teamLeader);

				teamMap.put(teamVO, memberVOArray);
			} //while

			// 만약에 key가 중복이 된다면 X	팀명이 같으면
			// key가 중복이 된다고 처리해야 된다.
			teamVO = new TeamVO("1조", 1, new MemberVO("홍길동"));
			memberVOArray = null;
			if(!teamMap.containsKey(teamVO)) {
				teamMap.put(teamVO, memberVOArray);
			} else {
				System.out.println( ">> 1조는 teamMap에 사용중이다." );
			}
			

			dispTeamMember(teamMap);
		} catch (Exception e) {
			e.printStackTrace();
		}

	} //main

	private static void dispTeamMember(LinkedHashMap<TeamVO, ArrayList<MemberVO>> teamMap) {
		Set<Entry<TeamVO, ArrayList<MemberVO>>> eset = teamMap.entrySet();
		Iterator<Entry<TeamVO, ArrayList<MemberVO>>> ir = eset.iterator();
		while (ir.hasNext()) {
			Entry<TeamVO, ArrayList<MemberVO>> entry = (Entry<TeamVO, ArrayList<MemberVO>>) ir.next();
			TeamVO teamVO = entry.getKey();
			System.out.printf("[%s(%d명) - %s]\n", teamVO.getName(), teamVO.getTotalNumber(), teamVO.getLeader().getName());

			/*
			ArrayList<MemberVO> memberVOArray = entry.getValue();

			if (memberVOArray != null) {
				int count = 1;
				for (MemberVO memberVO : memberVOArray) {
					System.out.printf("  [%d] %s\n", count++, memberVO.getName());
				} //for
			} else {
				System.out.println( "  팀원이 존재하지 않습니다." );
			}
			*/

			try {
				ArrayList<MemberVO> memberVOArray = entry.getValue();
				int count = 1;
				for (MemberVO memberVO : memberVOArray) {
					System.out.printf("  [%d] %s\n", count++, memberVO.getName());
				} //for
			} catch (NullPointerException e) {
				System.out.println( "  팀원이 존재하지 않습니다." );
			} catch (Exception e) {
				e.printStackTrace();
			} //try-catch
			
		} //while
	} //dispTeamMember()

} //class

class TeamVO {
	private String name;
	private int totalNumber;
	private MemberVO leader;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	public MemberVO getLeader() {
		return leader;
	}
	public void setLeader(MemberVO leader) {
		this.leader = leader;
	}

	public TeamVO() {
		super();
	}
	public TeamVO(String name, int totalNumber, MemberVO leader) {
		super();
		this.name = name;
		this.totalNumber = totalNumber;
		this.leader = leader;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		TeamVO vo = (TeamVO)obj;
		return this.name.equals(vo.name);
	}
	
	
} //class TeamVO


class MemberVO {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public MemberVO() {
		super();
	}
	public MemberVO(String name) {
		super();
		this.name = name;
	}
} //class MemberVO