package java_oop;

public class RoleType {
    private String roleType;
    private Role role;

    public RoleType(String roleType) {
        this.roleType = roleType;
        switch (roleType) {
            case "Admin" -> role = new Role(true, true, true, true);
            case "Main Customer" -> role = new Role(true, true, true, false);
            case "Customer" -> role = new Role(true, false, true, false);
            case "Viewer" -> role = new Role(true, false, false, false);
        }
    }

    public Role getRole() {return role;}
}
