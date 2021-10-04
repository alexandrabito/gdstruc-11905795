package com.alexandrabito;

import java.util.Objects;

public class Card {
    private int cardTypeId;
    private String cardName;
    private int cardValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return  cardTypeId == card.cardTypeId &&
                cardValue == card.cardValue &&
                Objects.equals(cardName, card.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardTypeId, cardName, cardValue);
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardTypeId= " + cardTypeId +
                "cardName=" + cardName +
                "'\'," +  "value="  + cardValue +
                '}';
    }

    public Card(int cardTypeId, String cardName, int cardValue) {
        this.cardTypeId = cardTypeId;
        this.cardName = cardName;
        this.cardValue = cardValue;
    }

    public int getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(int cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

}
