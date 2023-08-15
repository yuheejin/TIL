package days23;

public class Student implements Comparable<Integer>{ 
	
	private int no;
	private String name;
	private int kor;	
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private int rank; 
	private int wrank;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getWrank() {
		return wrank;
	}
	public void setWrank(int wrank) {
		this.wrank = wrank;
	}
	
	public Student() {
		super(); 
	}
	public Student(int no, String name, int kor, int eng, int mat, int tot, double avg, int rank, int wrank) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.rank = rank;
		this.wrank = wrank;
	}
	
	@Override
	public String toString() {
		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d"
				, no
				, name
				, kor
				, eng
				, mat
				, tot
				, avg 
				, rank
				, wrank
	);
		
	}
	
	@Override
	public int compareTo(Integer o) {		
		return this.tot - o.intValue() ;
	}  
	 
	
}
