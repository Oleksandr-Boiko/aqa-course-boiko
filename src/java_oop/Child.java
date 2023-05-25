package java_oop;

public class Child extends Parent {
    static {
        System.out.println("Child static initialization block");
    }

    {
        System.out.println("Child common initialization block");
    }

    public Child() {
        System.out.println("Child constructor block");
    }
}
