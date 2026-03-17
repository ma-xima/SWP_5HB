package maturaBeispiel;

public class MobileApp implements Observer{

    public void update(float temperature, float humidity) {
        System.out.println("Mobile Display: Temp=" + temperature +
                           " Humidity=" + humidity);
    }

}
