public class BasicCard extends Card{

    private String customerName;
    private String customerEmail;
    private int customerBalance;
    private boolean signUpPaid;

    public BasicCard(String name, String website, String helpline, String cardID,
                     int points, String cardType, String customerName, String customerEmail, int customerBalance, boolean signUpPaid){
        super(name, website,helpline, cardID, points, cardType);
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

    /**
     * @param purchaseAmount
     * @return the new points balance
     */
    public void calculatePoints(double purchaseAmount) {
        if (signUpPaid) {
            if (getCustomerBalance() < 500) {
                setPoints(points + (int) (Math.round(purchaseAmount * 0.015)));
            } else {
                setPoints(points + (int) (Math.round(purchaseAmount * 0.02)));
            }
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public int getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(int balance) {
        this.customerBalance = balance;
    }
}
