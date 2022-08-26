package projectA09S01;

public class Student {
	private String name; //이름
	private int kor; //국어 점수
	private int eng; // 영어 점수
	private int math; // 수학 점수
	
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public void studentInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("국어점수: " + this.kor);
		System.out.println("영어점수: " + this.eng);
		System.out.println("수학점수: " + this.math);
	}
}
