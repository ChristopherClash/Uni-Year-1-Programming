public class Patient implements Comparable<Patient> {
    private String firstName;
    private String surname;
    private String illness;
    private int severity;

    public Patient(String firstName, String surname, String illness,
                   int severity){
        setFirstName(firstName);
        setSurname(surname);
        setIllness(illness);
        setSeverity(severity);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        if ((severity < 1) || (severity > 5)){
            throw new IllegalArgumentException("Value out of range");
        }
        this.severity = severity;
    }

    /**
     * Overridden method to compare two patients so that a patient
     * with a higher severity level is higher in the queue
     * @param otherPatient
     * @return
     */
    @Override
    public int compareTo(Patient otherPatient){
        int otherSeverity = otherPatient.getSeverity();
        if (this.severity < otherSeverity){
            return 1;
        }
        else if (this.severity == otherSeverity){
            return 0;
        }
        else if (this.severity > otherSeverity){
            return  -1;
        }
        return 0;
    }
}
