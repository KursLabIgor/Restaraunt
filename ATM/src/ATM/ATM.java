package ATM;

public class ATM {

	Bank bnk1 = new Bank();

	float ballance;
	float cashAtm = 25000;
	//Currency carrency;

	void showBallance(Cards[] card, int IdCard, int PIN) {

		for (int i = 0; i < card.length; i++) {

			if (card[i] != null) {

				//if (!bnk1.checkStateCard(card[i])) {

					if (card[i].getIdCard() == IdCard) {

						if (card[i].getPin() == PIN) {

							ballance = card[i].getBallance(IdCard, PIN);
							System.out.println("Your ballance is: " + ballance);

						}

						else {
							System.out.println("Wrong PIN number");

						}

					}

					//else {System.out.println("Card number absent in a base");	}
				} else {
					System.out.println("Card locked");
				}
			}

		}

	//}

	void getCash(Cards[] card, int IdCard, int PIN, float cash) {

		for (int i = 0; i < card.length; i++) {

			if (card[i] != null) {

				if (!bnk1.checkStateCard(card[i])) {

					if (card[i].getIdCard() == IdCard) {

						if (card[i].getPin() == PIN) {

							ballance = card[i].getBallance(IdCard, PIN);
							if (cashAtm != 0) {

								if (cash > ballance) {
									System.out
											.println("Insufficiently money on your card, please set less number");
								} else if (cash > cashAtm) {
									System.out
											.println("Insufficiently money in ATM, please set less number");
								} else {
									card[i].setBallance(card[i].getBallance()
											- cash);
									System.out
											.println("Transaction finished succesfully, current ballance :"
													+ card[i].getBallance());
									cashAtm = cashAtm - cash;
								}
							} else {
								System.out.println("Money absent in ATM");
							}

						}

						else {
							System.out.println("Wrong PIN number");

						}

					}

					//else {System.out.println("Card number absent in a base");}
				} else {
					System.out.println("Card locked");
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bnk = new Bank();
		
		
		bnk.createNewCustomer("Trolo",1111, 0000, 273, false, 100, "uah");
		
		// bnk.lockUnlockCard(1111, false);
		//bnk.printAllCards();
		ATM atm = new ATM();
		atm.showBallance(bnk.cards, 1122, 0000);
		atm.getCash(bnk.cards, 1111, 0000, 255100);
		System.out.println(atm.cashAtm);
		// System.out.println(atm.bnk.cardIndex);

	}

}
