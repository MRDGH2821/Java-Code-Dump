package interfaces;

/**
 * Cat class, implements Animal interface.
 *
 * @class Cat
 */
public class Cat implements Animal {

  public void eat() {
    System.out.println("Chomp!");
  }

  @Override
  public void sound() {
    System.out.println("Meow!");
  }
}
