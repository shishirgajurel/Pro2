import java.util.List;

class TrafficLight extends Thread {
    private String currentLight = "RED";
    private List<Car> cars;
    private List<Pedestrain> pedestrains;
    // List of cars to notify

    public TrafficLight(List<Car> cars, List<Pedestrain> pedestrains) {
        this.cars = cars;
        this.pedestrains = pedestrains;
    }

    public String getCurrentLight() {
        return currentLight;
    }

    @Override
    public void run() {
        String[] lights = {"GREEN", "YELLOW", "RED"};
        int index = 0;

        while (true) {
            try {
                Thread.sleep(2000); // Change light every 2 seconds
                currentLight = lights[index];
                index = (index + 1) % 3;
                System.out.println("\nLight is " + currentLight);

                // Notify all cars to react
                for (Car car : cars) {
                    car.reactToLight(currentLight);
                }
                for (Pedestrain pedestrain : pedestrains) {
                    pedestrain.reactToLight(currentLight);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
