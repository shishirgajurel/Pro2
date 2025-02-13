public class TrafficLight implements Runnable {
    private String currentLight = "RED";

    public String getCurrentLight() {
        return currentLight;
    }


    public void run() {

            String[] lights = {"GREEN", "YELLOW", "RED"};
            int lightIndex = -1;

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lightIndex = (++lightIndex) % 3;
                String currentLight = lights[lightIndex];
                System.out.println("\nLight is " + currentLight);
            }

    }
}
