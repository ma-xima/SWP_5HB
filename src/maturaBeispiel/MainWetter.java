package maturaBeispiel;

public class MainWetter {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Observer mobile1 = new MobileApp();
        Observer mobile2 = new MobileApp();

        station.addObserver(mobile1);
        station.addObserver(mobile2);

        station.setMeasurements(22.5f, 60f);
    }

}
