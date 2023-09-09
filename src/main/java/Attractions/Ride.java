package Attractions;

public class Ride {
  private final String name;
  private final boolean is_open;
  private final int wait_time;

  public Ride(String name, boolean is_open, int wait_time) {
    this.name=name;
    this.is_open=is_open;
    this.wait_time=wait_time;
  }

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
