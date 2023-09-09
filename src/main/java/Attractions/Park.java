package Attractions;

public class Park {
  private final Land[] lands;

  public Park(Land[] lands) {
    this.lands=lands;
  }

  public Land[] getLands() {
    return lands;
  }

  public int getAverageWait() {
    int averageWait=0;

    for (Land land : lands) {
      averageWait+=land.avWaitTime();
    }

    averageWait= averageWait / lands.length;
    return averageWait;
  }

  @Override
  public String toString() {
    StringBuilder out = new StringBuilder();

    for (Land land : lands) {
      out.append(land.toString());
      out.append("\n");
    }

    return out.toString();
  }
}
