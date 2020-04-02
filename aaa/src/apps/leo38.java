package apps;

public class leo38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		Hunter hunter = new Hunter(bird);
		try {
		hunter.shootBird();
		}catch(Exception e) {}

	}
}

class Bird {
	private int leg;

	Bird() {
		leg = 2;
	}

	void setLeg(int leg) throws Exception { // 拋出例外要s (throws)
		if (leg < 0 || leg > 2) {
			throw new Exception(); // 這裏只用throw
		} else {
			this.leg = leg;
		}
	}
}

class Hunter {
	Bird bird;

	Hunter(Bird bird) {
		this.bird = new Bird();
	}

	void shootBird() throws Exception {
		try {
			bird.setLeg(3);		//更改leg的數量
//		} catch (Exception e) {
//			System.out.println("not much");
//			return;							//可以提早離開
		}finally {							//不管哪一段做完了 有finally就一定會在最後做這個
			System.out.println("here");		//即使提早說return也會做finally   可以確保這個區塊提早return之前會做的事情
		}									//可以試著做 try catch finally // try finally 這兩種有何區別
		System.out.println("OK");
	}
}

class HunterV2 extends Hunter{
	HunterV2(Bird bird){
		super(bird);
	}
	void shootBird() {						//我處理例外的東西比爸爸少就可以（發揚光大）
		
	}
}


