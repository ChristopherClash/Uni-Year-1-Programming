public class AnonCard extends Card {

    public AnonCard(String name, String website, String helpline, String cardID, int points, String cardType){
        super(name, website, helpline, cardID, points, cardType);
    }

    /**
     * @param purchaseAmount
     * @return the new points balance
     */
    public void calculatePoints(double purchaseAmount) {
        setPoints(points + (int) (Math.round(purchaseAmount * 0.01)));
    }
}
