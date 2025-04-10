package model;

public class ReservedState implements VinylState {
    private String reservedBy;

    public ReservedState(String reservedBy) {
        this.reservedBy = reservedBy;
    }

    @Override
    public void reserve(Vinyl vinyl, String user) {
        // Already reserved
    }

    @Override
    public void borrow(Vinyl vinyl, String user) {
        if (user.equals(reservedBy)) {
            vinyl.setState(new BorrowedState(user));
        }
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        // Cannot return a reserved Vinyl
    }

    @Override
    public void remove(Vinyl vinyl) {
        vinyl.setState(new MarkedForRemovalState());
    }

    @Override
    public String toString() {
        return "Reserved by " + reservedBy;
    }
}