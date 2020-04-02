package apps.tools;

public class Student {
	
	private String name;
	private int ch, eng, math;
	
	public Student(String name) {
		this.name= name;
	}
	
	public void setCh(int ch) { this.ch = ch;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math =math;	}
	
	
	@Override
	public String toString() {
		return name + ":" + ch + ":" + eng + ":" + math;
	}
}
