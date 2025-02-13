public class Pedestrain extends Thread {

    private int id;


    public Pedestrain(int id) {
        this.id = id;

    }

    public synchronized void reactToLight(String currentLight) {
        String reaction = switch (currentLight) {
            case "GREEN" -> "Pedestrain" + " Stops";
            case "YELLOW" -> "Pedestrain " + id + " waits for the red light";
            case "RED" -> "Pedestrain " + id + " moves";
            default -> throw new IllegalStateException("ooops");
        };
        System.out.println(reaction);
    }

}
