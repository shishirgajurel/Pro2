public class Car  extends Thread{

    private int id;
    private TrafficLight trafficLight;

    public Car(int id, TrafficLight trafficLight) {
        this.id = id;
        this.trafficLight = trafficLight;
    }

    public synchronized void reactToLight(String currentLight) {
        String reaction = switch (currentLight) {
            case "GREEN" -> "Car " + id + " drives";
            case "YELLOW" -> "Car " + id + " slows down";
            case "RED" -> "Car " + id + " stops";
            default -> throw new IllegalStateException("ooops");
        };
        System.out.println(reaction);
    }
}
