package qase.io.util;

public class CardData {
    private String cardName;
    private String cardDiscription;

    public CardData(String cardName, String cardDiscription) {
        this.cardName = cardName;
        this.cardDiscription = cardDiscription;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardDiscription() {
        return this.cardDiscription;
    }
}
