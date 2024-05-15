package player;

public class comPlayer implements playerInter {
	
	private static String Name = "Computer";
	
	public String rpsType = null;
	
	@Override
	public String getName() {
		return this.Name;
	}
	
	public void setRps() {
		double random = Math.random();
		
		//랜덤 값에 따른 컴퓨터 값 나오게 하기
		if(random >= 0.0 && random <= 3.3) {
			this.rpsType = "바위";
		} else if (random >= 3.4 && random <= 6.6) {
			this.rpsType = "보";
		} else {
			this.rpsType = "가위";
		}
	}
	
	@Override
	public String getRps() {
		return this.rpsType;
	}

}
