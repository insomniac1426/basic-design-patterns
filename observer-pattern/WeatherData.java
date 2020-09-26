import java.util.ArrayList;

public class WeatherData implements SubjectInterface {
  private float temperature;
  private float humidity;
  private float pressure;

  private ArrayList<ObserverInterface> observers;

  public WeatherData() {
    observers = new ArrayList<ObserverInterface>();
  }

  public void notifyOnChange() {
    // TODO: implement
  }

  public void setWeather(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyObservers();
  }

  public float getTemp() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void addObserver(ObserverInterface o) {
    observers.add(o);
  }

  public void deleteObserver(ObserverInterface o) {
    int observerIdx = observers.indexOf(o);
    if (observerIdx > 0) {
      observers.remove(observerIdx);
    }
  }

  public void notifyObservers() {
    for (ObserverInterface observer : observers) {
      observer.update(this);
    }
  }
}