package java_oop;

public class Role {
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;
    private String role;

    public Role(Boolean viewAll, Boolean editAll, Boolean addAll, Boolean deleteAll) {
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
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
