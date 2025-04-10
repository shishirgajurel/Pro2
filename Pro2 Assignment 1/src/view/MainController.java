package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import model.Vinyl;
import viewmodel.VinylViewModel;

public class MainController {
    @FXML
    private ListView<Vinyl> vinylListView;

    private VinylViewModel viewModel;

    public void setViewModel(VinylViewModel viewModel) {
        this.viewModel = viewModel;
        vinylListView.setItems(viewModel.getVinylList());
    }

    @FXML
    private void openDetailView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VinylDetailView.fxml"));
            Parent root = loader.load();
            VinylDetailController controller = loader.getController();
            controller.setViewModel(viewModel);
            controller.setSelectedVinyl(vinylListView.getSelectionModel().getSelectedItem());
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}