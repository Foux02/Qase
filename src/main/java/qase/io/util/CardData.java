package qase.io.util;

public class CardData {
    private String cardName;
    private String cardDiscription;
    private String priorityNumber;

    public CardData(String cardName, String cardDiscription,String priorityNumber) {
        this.cardName = cardName;
        this.cardDiscription = cardDiscription;
        this.priorityNumber = priorityNumber;
    }

    public String getCardName() {
        return this.cardName;
    }
    public String getCardDiscription() {
        return this.cardDiscription;
    }
    public String getPriorityNumber() { return this.priorityNumber; }
}
