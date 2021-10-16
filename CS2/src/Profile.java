import java.util.ArrayList;

public class Profile {
    private String lastName;
    private String firstName;
    private int dayDOB;
    private int monthDOB;
    private int yearDOB;
    private String emailAddress;
    private String[] interests;
    private String[] activities;
    private final ArrayList<Profile> friends = new ArrayList<>();

    /**
     * Constructs a new profile
     * @param firstName - first name of the user
     * @param lastName - surname of the user
     * @param dayDOB - day of the user's DOB
     * @param monthDOB - month of the user's DOB
     * @param yearDOB - year of the user's DOB
     * @param emailAddress - user's email address
     * @param interests - Array of user's interests
     * @param activities - Array of user's activities
     */
    public Profile(String firstName, String lastName, int dayDOB, int monthDOB,
                   int yearDOB, String emailAddress,
                   String[] interests, String[] activities){
        setFirstName(firstName);
        setLastName(lastName);
        setDayDOB(dayDOB);
        setMonthDOB(monthDOB);
        setYearDOB(yearDOB);
        setEmailAddress(emailAddress);
        setInterest(interests);
        setActivities(activities);
    }

    /**
     *
     * @return String of user's DOB
     */
    public String getDateOfBirth(){
        return (dayDOB + "-" + monthDOB + "-" + yearDOB);
    }

    /**
     * Adds a new profile to the friends Arraylist
     * @param p
     */
    public void insertFriend(Profile p){
        friends.add(p);
    }

    /**
     *
     * @param i - position in Arraylist
     * @return profile in friends Arraylist in position i
     */
    public Profile getFriend(int i){
        return friends.get(i);
    }

    /**
     *
     * @return the size of the friends Arraylist
     */
    public int numOfFriends(){
        return friends.size();
    }

    /**
     * Overridden method
     * @return String of user's firstname, surname, DOB and email address
     */
    @Override
    public String toString(){
        return firstName + "," + lastName + ","+ getDateOfBirth() + "," + emailAddress;
    }

    /**
     *
     * @return user's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets user's surname
     * @param lastName - user's surname
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return user's firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets user's firstname
     * @param firstName - user's firstname
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return user's day component of DOB
     */
    public int getDayDOB() {
        return dayDOB;
    }

    /**
     * Sets user's day component of DOB
     * @param dayDOB - user's day component of DOB
     */
    public void setDayDOB(int dayDOB) {
        this.dayDOB = dayDOB;
    }

    /**
     *
     * @return user's month component of DOB
     */
    public int getMonthDOB() {
        return monthDOB;
    }

    /**
     * Sets user's month component of DOB
     * @param monthDOB - user's month component of DOB
     */
    public void setMonthDOB(int monthDOB) {
        this.monthDOB = monthDOB;
    }

    /**
     *
     * @return user's year component of DOB
     */
    public int getYearDOB() {
        return yearDOB;
    }

    /**
     * Sets user's year component of DOB
     * @param yearDOB - user's year component of DOB
     */
    public void setYearDOB(int yearDOB) {
        this.yearDOB = yearDOB;
    }

    /**
     *
     * @return user's email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets user's email address
     * @param emailAddress - user's email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     *
     * @return array of user's interests
     */
    public String[] getInterests() {
        return interests;
    }

    /**
     * sets array of user's interests
     * @param interests - array of user's interests
     */
    public void setInterest(String[] interests) {
        this.interests = interests;
    }

    /**
     *
     * @return array of user's activities
     */
    public String[] getActivities() {
        return activities;
    }

    /**
     * Sets array of user's activities
     * @param activities - array of user's activities
     */
    public void setActivities(String[] activities) {
        this.activities = activities;
    }
}
