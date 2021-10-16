public class PremiumCard extends Card{

    private String customerName;
    private String customerEmail;
    private int customerBalance;
    boolean signUpPaid;

    public PremiumCard(String name, String website, String helpline, String cardID,
                       int points, String cardType, String customerName, String customerEmail, int customerBalance, boolean signUpPaid){
        super(name, website, helpline, cardID, points, cardType);
        setCustomerName(customerName);
        setCustomerEmail(customerEmail);
        setCustomerBalance(customerBalance);
        setSignUpPaid(signUpPaid);
    }

    public boolean isSignUpPaid() {
        return signUpPaid;
    }

    public void setSignUpPaid(boolean signUpPaid) {
        this.signUpPaid = signUpPaid;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(int customerBalance) {
        this.customerBalance = customerBalance;
    }

    /**
     * @param purchaseAmount
     * @return the new points balance
     */
    public void calculatePoints(double purchaseAmount) {
        if (signUpPaid) {
            if (purchaseAmount < 40 && customerBalance < 1000) {
                setPoints(points + (int) (Math.round(purchaseAmount * 0.03)));
            } else {
                setPoints(points + (int) (Math.round(purchaseAmount * 0.04)));
            }
        }
    }
}
