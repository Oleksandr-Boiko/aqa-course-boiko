package java_oop;

public class Card {
    private String id;
    private String number;
    private String expiredDate;
    private int cvv;
    private String cardType;

    public Card(String number, String expiredDate, int cvv, String cardType) {
        id = "1" + System.currentTimeMillis();
        if (cardType.equals("Visa") || cardType.equals("MasterCard")){
            this.cardType = cardType;
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
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
