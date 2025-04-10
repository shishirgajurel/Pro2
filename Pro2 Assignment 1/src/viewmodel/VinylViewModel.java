package viewmodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Vinyl;

public class VinylViewModel {
    private ObservableList<Vinyl> vinylList;

    public VinylViewModel() {
        vinylList = FXCollections.observableArrayList();
        // Add some hardcoded Vinyls for testing
        vinylList.add(new Vinyl("Thriller", "Michael Jackson", 1982));
        vinylList.add(new Vinyl("Back in Black", "AC/DC", 1980));
    }

    public ObservableList<Vinyl> getVinylList() {
        return vinylList;
    }
}