package model;

public class MarkedForRemovalState implements VinylState {
    @Override
    public void reserve(Vinyl vinyl, String user) {
        // Cannot reserve a Vinyl marked for removal
    }

    @Override
    public void borrow(Vinyl vinyl, String user) {
        // Cannot borrow a Vinyl marked for removal
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        vinyl.setState(new AvailableState());
    }

    @Override
    public void remove(Vinyl vinyl) {
        // Already marked for removal
    }

    @Override
    public String toString() {
        return "Marked for Removal";
    }
}