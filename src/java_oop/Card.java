package java_oop;

import static java_oop.CardType.MASTERCARD;
import static java_oop.CardType.VISA;

public class Card {
    private String id;
    private String number;
    private String expiredDate;
    private int cvv;
    private CardType cardType;

    public Card(String number, String expiredDate, int cvv, CardType typeOfCard) {
        id = "1" + System.currentTimeMillis();
        if (typeOfCard.equals(VISA) || typeOfCard.equals(MASTERCARD)){
            this.cardType = typeOfCard;
        }
        else {
            System.out.println("java_oop.Card type must be Visa or MasterCard");
        }

        this.number = number;
        this.expiredDate = expiredDate;
        this.cvv = cvv;

    }

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = CardType.valueOf(cardType);
    }

    @Override
    public String toString() {
        return "java_oop.Card{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", expiredDate='" + expiredDate + '\'' +
                ", cvv=" + cvv +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
