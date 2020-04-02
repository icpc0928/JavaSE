package apps;

public class leo54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 複習抽象 又不能做物件實體 、目的是多形   ＶＳ 傳統一個一個寫方法      （抽象跟介面都是玩多型）
		
		NormalMember member1 = new NormalMember();
		Staff staff = new Staff();
		CorpMember member2 = new CorpMember(staff);
		
		callPhone(member1);
		callPhone(member2);							//4.這樣就能呼叫惹

	}
	
	static void callPhone(Member m1) {
		String phone = m1.getPhone();				//3.這裏只需要一招就行了 不用像下面兩招維護不易
	}
	
	static void callPhone1(NormalMember m1) {
		String phone = m1.getPhone();
	}
	static void callPhone2(CorpMember m1) {
		String phone = m1.getPhone();
	}
}


abstract class Member{
	abstract String getPhone();					//1.抽象多形
}






class NormalMember extends Member{				//2.只需要繼承於抽象就好
	private String phone = "0912-345678";

	String getPhone() {
		return phone;
	}

}

class CorpMember extends Member{				//2.只需要繼承於抽象就好
	private String tel = "04-23245678";
	private Staff staff;

	CorpMember(Staff staff) {
		this.staff = staff;
	}

	Staff getStaff() {
		return staff;
	}

	String getTel() {
		return tel;
	}

	String getPhone() {
		return staff.getPhone();
	}

}

class Staff {
	private String phone = "0934175258";

	String getPhone() {
		return phone;
	}
}