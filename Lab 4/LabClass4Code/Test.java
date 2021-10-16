import java.util.ArrayList;

public class Test {
    public static void main (String[] args){

        final String WEBSITE = "www.nmg.co.uk";
        final String HELPLINE = "111-111-200";
        int lowPoints = 0, midPoints = 0, highPoints = 0;

        /** instantiates new cards **/
        BasicCard basicCard = new BasicCard("NMG", WEBSITE, HELPLINE,
                "1", 1998, "Basic Card", "Jeff Bezos",
                "JeffBezos@gmail.com", 400, true);

        PremiumCard premiumCard = new PremiumCard("NMG", WEBSITE, HELPLINE,
                "2", 200, "Premium Card", "Elon Musk",
                "ElonMusk@gmail.com", 250, false);

        PremiumCard premiumCard2 = new PremiumCard("NMG", WEBSITE, HELPLINE,
                "3", 890, "Premium Card", "Chris Clash",
                "ChrisClash@gmail.com", 460, true);

        AnonCard anonCard = new AnonCard("NMG", WEBSITE, HELPLINE,
                "4", 700, "Anon Card");

        ArrayList<Card> cards = new ArrayList<>();
        ArrayList<Double> purchaseAmounts = new ArrayList<>();

        purchaseAmounts.add(50.99);
        purchaseAmounts.add(120.00);
        purchaseAmounts.add(60.00);

        cards.add(basicCard);
        cards.add(premiumCard);
        cards.add(premiumCard2);
        cards.add(anonCard);

        /**
         * for each card in cards and for each purchase in purchaseAmounts calculate points
         * then increment either high, mid or low points respectively
         */
        for (Card elem : cards){
            System.out.println("For a " + elem.getCardType() + " " + elem.signUpFee(elem.getCardType()));
            for (Double purchaseAmount : purchaseAmounts){
                elem.calculatePoints(purchaseAmount);
                System.out.println("Card " + elem.getCardID() + " has " + elem.getPoints() + " points");
            }
            if (elem.getPoints() >= 2000){
                highPoints++;
            }
            else if (elem.getPoints() >= 500 && elem.getPoints() < 2000){
                midPoints++;
            }
            else if (elem.getPoints() < 500){
                lowPoints++;
            }
        }
        System.out.println("There are " + lowPoints + " low points customers, "
        + midPoints + " midpoints customers and " + highPoints + " high points customers");
    }
}
