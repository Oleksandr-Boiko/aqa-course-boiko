package java_oop;

public class RoleType {
    private Role role;
    private roles typeOfRole;

    public RoleType(roles typeOfRole) {
        this.typeOfRole = typeOfRole;
        switch (typeOfRole) {
            case ADMIN -> role = new Role(true, true, true, true);
            case MAIN_CUSTOMER -> role = new Role(true, true, true, false);
            case CUSTOMER -> role = new Role(true, false, true, false);
            case VIEWER -> role = new Role(true, false, false, false);
        }
    }

    public Role getRole() {return role;}
}
