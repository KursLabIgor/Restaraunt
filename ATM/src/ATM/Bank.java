package ATM;

public class Bank {

	public Cards[] cards = new Cards[1000];
	public Currency cur;
	public Customer cs;
	private int amountCards = 1000;
	public int cardIndex = 0;
	private float amountCash = 25000;

	Cards createCard(int idCard, int PIN, int uin, boolean LockState,float Ballance, String Currency) {

		cards[cardIndex] = new Cards(idCard, PIN, uin, LockState, Ballance,
				Currency);

		cardIndex++;

		return cards[cardIndex];
	}
   Customer createNewCustomer(String Name,int idCard, int PIN, int uin, boolean LockState,float Ballance, String Currency){
	   
	   Cards cr = createCard(idCard, PIN, uin, LockState, Ballance, Currency);
	   cs = new Customer(Name, cr);
	  
	   return cs;
   }
	void setCurrencyLimit() {
		cur.setAmountCash(amountCash);
	}

	void printAllCards() {

		for (int i = 0; i < cardIndex; i++) {
			System.out.println("Bank info:" + cards[i].getIdCard());

		}
	}

	void lockUnlockCard(int IdCard, boolean lockSate) {
		for (int i = 0; i < cardIndex; i++) {
			if (cards[i].getIdCard() == IdCard) {

				cards[i].setLockState(lockSate);

				if (lockSate) {
					System.out.println("Card has been locked with ID: "
							+ IdCard);
				}

				else {
					System.out.println("Card has been unlocked with ID: "
							+ IdCard);
				}

			}

		}

	}

	void lockUnlockCard(Cards card, boolean LockState) {
		if (LockState) {
			card.setLockState(LockState);
		} else {
			card.setLockState(LockState);
		}
	}

	boolean checkStateCard(Cards card) {

		return card.isLockState();
	}

}
