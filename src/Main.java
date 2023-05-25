import java_oop.*;

import static java_oop.CardType.MASTERCARD;
import static java_oop.CardType.VISA;

public class Main {
    public static void main(String[] args) {
        Manager pedro = new Manager("Pedro Huan", "pedro.huan@pdffiller.team", new RoleType(Roles.ADMIN), "Master Yoda");
        try {
            pedro.setWorkPhoneNumber("380931234567");
        } catch (PhoneFormatException e) {
            e.printStackTrace();
        }
        pedro.setResponsibilityDistrict("Yoda's Hut");
        pedro.setPosition("Head Of Jedi");
        pedro.printInfo();
        System.out.println(pedro.getId());
        User alex = new User("Oleksandr", "Boiko", "alex.boiko@pdffiller.team", new RoleType(Roles.MAIN_CUSTOMER));
        alex.setDeliveryAddress(new Address("Ukraine", "Kyiv", "Paladina", "29", "03114"));
        alex.setCards(new Card("4444 3322 1122 5555", "09/28", 731, MASTERCARD));
        alex.setCards(new Card("4322 2342 3333 6666", "01/24", 777, VISA));
        alex.setCards(new Card("4141 6345 1111 7777", "02/25", 888, MASTERCARD));
        alex.printAllUserCards();
        alex.setManager(pedro);
        alex.printInfo();
        System.out.println(alex.getId());

        Child child = new Child();
    }
}
