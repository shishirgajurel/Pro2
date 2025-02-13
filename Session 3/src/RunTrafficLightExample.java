import java.util.Arrays;
import java.util.List;

public class RunTrafficLightExample {
    public static void main(String[] args) {
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = new Car(3);
        Pedestrain pedestrain1 = new Pedestrain(1);
        Pedestrain pedestrain2 = new Pedestrain(2);
        Pedestrain pedestrain3 = new Pedestrain(3);
        Pedestrain pedestrain4 = new Pedestrain(4);

        List<Car> cars = Arrays.asList(car1, car2, car3);
        List<Pedestrain> pedestrains = Arrays.asList(pedestrain1, pedestrain2, pedestrain3);
        TrafficLight trafficLight = new TrafficLight(cars, pedestrains);

        trafficLight.start();

    }
}
