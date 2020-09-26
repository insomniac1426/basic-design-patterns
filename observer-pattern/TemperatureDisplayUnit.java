public class TemperatureDisplayUnit implements Display, ObserverInterface {
  private float temperature;
  private WeatherData wd;

  public TemperatureDisplayUnit(WeatherData wd) {
    this.wd = wd;
  }

  public void update(Object o) {
    if (o instanceof WeatherData) {
      WeatherData wd = (WeatherData) o;
      temperature = wd.getTemp();
      display();
    }
  };

  public void display() {
    System.out.println("Current temperature is : " + temperature);
  };
}
