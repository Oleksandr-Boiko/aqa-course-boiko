package java_oop;

public class Manager extends User {
    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String fullName, String email, String role, String position) {
        super(fullName, email, role);
        this.position = position;
    }

    public Manager(String firstName, String lastName, String email, String role, String position) {
        super(firstName, lastName, email, role);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        if (workPhoneNumber.startsWith("+")){
            this.workPhoneNumber = workPhoneNumber;
        }
        else {
            System.out.println("Error: phone number must starts from + symbol");
        }
    }

    @Override
    public String toString() {
        return "java_oop.Manager{" +
                "position='" + position + '\'' +
                ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println(toString());
    }
}
