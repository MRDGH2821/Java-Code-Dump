package basics;

import java.util.ArrayList;

/**
 * Basics of Arrays.
 *
 * @class Arrays
 */
public class Arrays {

  /** Creates an array of colours and performs operations on it. */
  public static void main() {

    ArrayList<String> colours = new ArrayList<String>();

    colours.add("Red");
    colours.add("Blue");
    colours.add("Green");
    colours.add("Orange");
    colours.remove("Red");

    String a = colours.get(2);
    System.out.println(a);
    System.out.println(colours);

    boolean n = colours.contains("green");
    System.out.println(n);
  }
}
