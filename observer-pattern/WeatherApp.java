public class WeatherApp {
  public static void main(String[] args) {
    // create a weather data
    WeatherData WD = new WeatherData();

    // create a display unit and add it as an observer to weather data;
    TemperatureDisplayUnit TDU = new TemperatureDisplayUnit(WD);
    WD.addObserver(TDU);

    // create a display unit and add it as an observer to weather data;
    PressureDisplayUnit PDU = new PressureDisplayUnit(WD);
    WD.addObserver(PDU);

    WD.setWeather(12.4f, 11.2f, 19.0f);
    WD.setWeather(18.9f, 11.2f, 20.0f);
  }
}
