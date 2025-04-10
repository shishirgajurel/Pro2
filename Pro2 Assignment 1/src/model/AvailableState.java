package model;

public class AvailableState implements VinylState {
    @Override
    public void reserve(Vinyl vinyl, String user) {
        vinyl.setState(new ReservedState(user));
    }

    @Override
    public void borrow(Vinyl vinyl, String user) {
        vinyl.setState(new BorrowedState(user));
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        // Cannot return an available Vinyl
    }

    @Override
    public void remove(Vinyl vinyl) {
        vinyl.setState(new MarkedForRemovalState());
    }

    @Override
    public String toString() {
        return "Available";
    }
}