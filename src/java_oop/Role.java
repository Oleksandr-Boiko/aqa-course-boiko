package java_oop;

public class Role {
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;
    private String role;

    public Role(String role) {
        this.role = role;
        switch (role) {
            case "Admin" -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = true;
            }
            case "Main Customer" -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = false;
            }
            case "Customer" -> {
                viewAll = true;
                editAll = false;
                addAll = true;
                deleteAll = false;
            }
            case "Viewer" -> {
                viewAll = true;
                editAll = false;
                addAll = false;
                deleteAll = false;
            }
        }
    }

    @Override
    public String toString() {
        return "java_oop.Role{" +
                "viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                ", role='" + role + '\'' +
                '}';
    }
}
