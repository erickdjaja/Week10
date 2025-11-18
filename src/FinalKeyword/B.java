public class B extends A {

    void method1() {                     // ERROR (tidak bisa override)
        System.out.println("Illegal!");
    }
}
