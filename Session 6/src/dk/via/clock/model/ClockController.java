package dk.via.clock.model;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ClockController {

    @FXML
    private Label clockLabel;
    private final ClockVM vm;

    public ClockController(ClockVM vm) {
        this.vm = vm;
    }
    public void initialize() {
        clockLabel.textProperty().bind(vm.clockProp());
    }
}
