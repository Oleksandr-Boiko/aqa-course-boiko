package java_oop;

import java.util.List;

public class Broker implements PrintInfo {
    private String name;
    private String email;
    private String phoneNumber;
    List<User> listOfClients;

    public Broker(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Broker{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", listOfClients=" + listOfClients +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
