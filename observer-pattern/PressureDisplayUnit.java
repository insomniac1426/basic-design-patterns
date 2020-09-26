public class PressureDisplayUnit implements Display, ObserverInterface {
  private float pressure;
  private WeatherData wd;

  public PressureDisplayUnit(WeatherData wd) {
    this.wd = wd;
  }

  public void display() {
    System.out.println("Current Pressure is: " + pressure);
  }

  public void update(Object o) {
    if (o instanceof WeatherData) {
      WeatherData w = (WeatherData) o;
      pressure = w.getPressure();
      display();
    }
  }

}
