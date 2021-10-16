
/**
 * @author muneebimtiazahmad
 * A class that implements shop that has cards
 *
 */

public abstract class Card {
	
	protected String name;
	protected String website;
	protected String helpline;
	protected String cardID;
	protected int points;
	protected String cardType;

	/**
	 * Create a new Card issued by the Shop.
	 * @param name The name of the shops.
	  * @param website The website of the shop. 
	 * @param helpline The helpline of the shop. 
	 * @param cardID The ID of the card.
	 * @param points The available points on the card.
	 */

	public Card(String name, String website, String helpline, String cardID, int points, String cardType) {
		setName(name);
		setWebsite(website);
		setHelpline(helpline);
		setCardID(cardID);
		setPoints(points);
		setCardType(cardType);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}


	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}


	/**
	 * @return the helpline
	 */
	public String getHelpline() {
		return helpline;
	}


	/**
	 * @param helpline the helpline to set
	 */
	public void setHelpline(String helpline) {
		this.helpline = helpline;
	}


	/**
	 * @return the cardID
	 */
	public String getCardID() {
		return cardID;
	}


	/**
	 * @param cardID the cardID to set
	 */
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}


	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}


	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	
	/**
     * calculates the point for each card against a purchase
     *  but we really don't know what
     * to do here because card category is not defined.
     */
	public abstract void calculatePoints(double purchaseAmount);

	/**
	 * @return the card type
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @param cardType the card type to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * @param cardType
	 * @return the sign up fee for that card type
	 */
	public String signUpFee(String cardType){
		switch (cardType) {
			case "Basic Card":
				return ("the sign up fee is £5");
			case "Premium Card":
				return ("the sign up fee is £25");
			case "Anon Card":
				return ("there is no sign up fee");

		} return ("No valid card type entered");
	}
}
