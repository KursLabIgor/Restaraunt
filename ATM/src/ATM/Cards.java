package ATM;

public class Cards {

	int idCard;
	int pin;
	int uin;
	float ballance;
	boolean lockState;
	Currency cur = new Currency();
	public Cards(int CardId, int PIN, int UIN, boolean LockState, float Ballance, String Currency) {
		
		this.idCard = CardId;
		this.pin = PIN;
		this.uin = UIN;
		this.lockState = LockState;
		this.ballance = Ballance;
		this.cur.name = Currency;
		
	}
	public int getIdCard() {
		return idCard;
	}
	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public float getBallance() {
		return ballance;
	}
	public void setBallance(float ballance) {
		
		this.ballance = ballance;
	}
	public boolean isLockState() {
		return lockState;
	}
	public void setLockState(boolean lockState) {
		this.lockState = lockState;
	}
	
	boolean ChangePin(int IdCard, int PIN){
		if(IdCard == getIdCard()){
			
			setPin(PIN);
			return true;
		}
		
		
		return false;
	}
	boolean LockUnlockCard(int IdCard){
	
		if(IdCard == getIdCard()){
			if(!isLockState()){	
				setLockState(false);
			}
			return true;
		}
		
		return false;
	}
	float getBallance(int IdCard, int PIN){
		
		return getBallance();
		
	}
	boolean AddCash(int IdCard, float Money){
	
		if(IdCard == getIdCard()){
			if(!isLockState()){
				setBallance(getBallance() + Money);
				return true;
		
			}
		}
		return false;
	}
	
	
}
