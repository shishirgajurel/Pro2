import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainController;
import viewmodel.VinylViewModel;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VinylViewModel viewModel = new VinylViewModel();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/MainView.fxml"));
        Parent root = loader.load();
        MainController controller = loader.getController();
        controller.setViewModel(viewModel);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}