package java_oop;

import java.util.ArrayList;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Card> cards = new ArrayList<>();
    private Role role;
    private Manager manager;
    public String userDataToPrint = "java_oop.User{" +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", fullName='" + fullName + '\'' +
            ", email='" + email + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", billingAddress='" + billingAddress + '\'' +
            ", deliveryAddress='" + deliveryAddress + '\'' +
            ", role='" + role + '\'' +
            '}';

    public User(String fullName, String email, String role) {
        id = "1" + System.currentTimeMillis();
        this.fullName = fullName;
        String[] splittedFullName = fullName.split(" ");
        this.firstName = splittedFullName[0];
        this.lastName = splittedFullName[1];
        this.email = email;
        this.role = new Role(role);
    }

    public User(String firstName, String lastName, String email, String role) {
        this(firstName.concat(" " + lastName), email, role);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")){
            this.phoneNumber = phoneNumber;
        }
        else {
            System.out.println("Error: phone number must starts from + symbol");
        }
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(Card card) {
        this.cards.add(card);
    }

    public Role getRole() {
        return role;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "java_oop.User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", cards='" + cards + '\'' +
                ", role='" + role + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }

    public void printUserInfo() {
        System.out.println(userDataToPrint);
    }
}
