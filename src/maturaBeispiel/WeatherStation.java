package maturaBeispiel;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private List<Observer> observers = new ArrayList<>();
       private float temperature;
       private float humidity;


   public void addObserver(Observer o) {
       observers.add(o);

   }

   public void removeObserver(Observer o) {
       observers.remove(o);

   }

   public void notifyObserver() {
       for (Observer o : observers) {
           o.update(temperature, humidity);
       }
   }

   public void setMeasurements(float temperature, float humidity) {
       this.temperature = temperature;
       this.humidity = humidity;
       notifyObserver();
   }

}
