package classes;

/**
 * Basics of Classes.
 *
 * @class ClassBasics
 */
public class ClassBasics {

  /** Calls functions that instantiate a class. */
  public static void main(String[] args) {
    myClass();
    cat();
  }

  /** Instantiates MyClass. */
  public static void myClass() {
    MyClass var = new MyClass();

    var.simplePrint("This is main method");
    var.add(1, 2);
  }

  /** Instantiates Cat. */
  public static void cat() {
    Cat cat = new Cat();
    cat.makeSound();
  }
}
