package Attractions;

/**
 * Object that represents a single ride within the theme park
 * @author Tanner Hartwell
 */
public class Ride {
  private final String name;
  private final boolean is_open;
  private final int wait_time;

  /**
   * Constuctor for ride object
   * @param name of ride
   * @param is_open represents if the ride open
   * @param wait_time of the ride
   */

  public Ride(String name, boolean is_open, int wait_time) {
    this.name=name;
    this.is_open=is_open;
    this.wait_time=wait_time;
  }

  /**
   * Get the wait time of the ride
   * @return int representing the wait time in min
   */
  public int getWait_time() {
    return wait_time;
  }

  @Override
  public String toString() {
    StringBuilder string = new StringBuilder();
    string.append("Name: ").append(name);
    string.append('\n');

    if (is_open) {
      string.append("Status: ").append("Open");
      string.append("\n");
      string.append("Wait: ").append(wait_time);
    }

    else  {
      string.append("Status: ").append("Closed");
    }


    return string.toString();
  }
}
