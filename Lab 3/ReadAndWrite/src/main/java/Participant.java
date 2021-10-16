public final class Participant {

    private String participantID;
    private String collectionDate;
    private String collectionTime;
    private int heartRate;

    public Participant(String partID, String collDate, String collTime, int mean){
        setParticipantID(partID);
        setCollectionDate(collDate);
        setCollectionTime(collTime);
        setHeartRate(mean);
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collDate) {
        collectionDate = collDate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int mean) {
        heartRate = (60 * 1000)/ mean;
    }

    public String getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(String collTime) {
       collectionTime = collTime;
    }

    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String partID) {
        participantID = partID;
    }
}
