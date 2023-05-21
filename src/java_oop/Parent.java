package java_oop;

public class Parent {
    static {
        System.out.println("Parent static initialization block");
    }

    {
        System.out.println("Parent common initialization block");
    }

    public Parent() {
        System.out.println("Parent constructor block");
    }
}

