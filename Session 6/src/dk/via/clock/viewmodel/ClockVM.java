package dk.via.clock.viewmodel;

import dk.via.clock.model.ClockService;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockVM {
    private StringProperty clockProp = new SimpleStringProperty();
    public ClockVM(ClockService clockService) {
        clockService.addListener(this::reactTotime);
    }
    private void reactTotime(long currentTime) {
        DateFormat simple = new SimpleDateFormat("HH:mm:ss");
        Date result = new Date(currentTime);
        String timeAsStringNicelyFormatted = simple.format(result);
        Platform.runLater(()->clockProp.set(timeAsStringNicelyFormatted));
    }
    public StringProperty clockProp() {
        return clockProp;
    }
}
