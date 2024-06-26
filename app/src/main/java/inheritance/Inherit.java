package inheritance;

/**
 * Main class to run the inheritance.
 *
 * @class Inherit
 */
public class Inherit {

  /** Demonstrates inheritance. */
  public static void main(String[] args) {
    SubSample subSample = new SubSample();
    subSample.upper();

    Sample sample = new Sample();
    sample.text();
  }
}
