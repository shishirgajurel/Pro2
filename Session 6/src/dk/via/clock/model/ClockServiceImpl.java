package dk.via.clock.model;

import javafx.fxml.FXML;

import java.util.ArrayList;

public class ClockServiceImpl implements ClockService {
    private final List<ClockListner> listeners = new ArrayList<>();

    public ClockServiceImpl() {
        Thread thread = new Thread(this::clockCounter);
        thread.setDaemon(true);
        thread.start();

    }

    private void clockCounter() {
        while (true) {
            try {
                Thread.sleep(250);

            } catch (InterruptedException ignored) {

            }
            long currentTimeMillis = System.currentTimeMillis();
            notifyListeners(currentTimeMillis);
        }
    }

    @Override
public void addListener(ClockListener listener){
    listener.add(listener);
    }

private void notifyListeners(long currentTimeMillis) {
        listeners.forEach(clockListener->clockListener.update(currentTime));
}
    }


