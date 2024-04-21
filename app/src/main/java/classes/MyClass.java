package classes;

/**
 * Basics of Classes. Helper class for ClassBasics.java
 *
 * @class MyClass
 */
public class MyClass {
  String name = "Hi";

  void simplePrint() {
    System.out.println(this.name);
  }

  void simplePrint(String name) {
    System.out.println(name);
  }

  int add(int a, int b) {
    System.out.println(a + b);
    return a + b;
  }
}
