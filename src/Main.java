import java_oop.*;

public class Main {
    public static void main(String[] args) {
        Manager pedro = new Manager("Pedro Huan", "pedro.huan@pdffiller.team", new RoleType("Admin"), "Master Yoda");
        pedro.setWorkPhoneNumber("+380931234567");
        pedro.setResponsibilityDistrict("Yoda's Hut");
        pedro.setPosition("Head Of Jedi");
        pedro.printUserInfo();
        System.out.println(pedro.getId());
        User alex = new User("Oleksandr", "Boiko", "alex.boiko@pdffiller.team", new RoleType("Main Customer"));
        alex.setDeliveryAddress(new Address("Ukraine", "Kyiv", "Paladina", "29", "03114"));
        alex.setCards(new Card("4444 3322 1122 5555", "09/28", 731, "MasterCard"));
        alex.setManager(pedro);
        alex.printUserInfo();
        System.out.println(alex.getId());

        Child child = new Child();
    }
}
