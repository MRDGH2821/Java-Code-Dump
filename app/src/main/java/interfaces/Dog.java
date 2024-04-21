package interfaces;

/**
 * Dog class.
 *
 * @class Dog
 */
public class Dog implements Animal {

  public void eat() {
    System.out.println("Chomp!");
  }

  public void sound() {
    System.out.println("Bark");
  }

  /** Demonstrates the use of the Dog class. */
  public static void main() {
    Animal a = new Dog();

    a.eat();
    a.sound();
  }
}
