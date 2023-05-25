package java_oop;

import static java_oop.Roles.*;

public class RoleType {
    private Role role;
    private Roles typeOfRole;

    public RoleType(Roles typeOfRole) {
        this.typeOfRole = typeOfRole;
        switch (typeOfRole) {
            case ADMIN -> role = new Role(true, true, true, true, ADMIN);
            case MAIN_CUSTOMER -> role = new Role(true, true, true, false, MAIN_CUSTOMER);
            case CUSTOMER -> role = new Role(true, false, true, false, CUSTOMER);
            case VIEWER -> role = new Role(true, false, false, false, VIEWER);
        }
    }

    public Role getRole() {return role;}
}
