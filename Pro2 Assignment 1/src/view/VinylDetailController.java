package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Vinyl;
import viewmodel.VinylViewModel;

public class VinylDetailController {
    @FXML
    private Label vinylLabel;

    private VinylViewModel viewModel;
    private Vinyl selectedVinyl;

    public void setViewModel(VinylViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void setSelectedVinyl(Vinyl vinyl) {
        this.selectedVinyl = vinyl;
        updateView();
    }

    private void updateView() {
        vinylLabel.setText(selectedVinyl.toString());
    }

    @FXML
    private void reserveVinyl() {
        selectedVinyl.reserve("User");
        updateView();
    }

    @FXML
    private void borrowVinyl() {
        selectedVinyl.borrow("User");
        updateView();
    }

    @FXML
    private void returnVinyl() {
        selectedVinyl.returnVinyl();
        updateView();
    }

    @FXML
    private void removeVinyl() {
        selectedVinyl.remove();
        updateView();
    }
}