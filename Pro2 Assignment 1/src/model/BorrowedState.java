package model;

public class BorrowedState implements VinylState {
    private String borrowedBy;

    public BorrowedState(String borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    @Override
    public void reserve(Vinyl vinyl, String user) {
        vinyl.setState(new BorrowedAndReservedState(borrowedBy, user));
    }

    @Override
    public void borrow(Vinyl vinyl, String user) {
        // Already borrowed
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        vinyl.setState(new AvailableState());
    }

    @Override
    public void remove(Vinyl vinyl) {
        vinyl.setState(new MarkedForRemovalState());
    }

    @Override
    public String toString() {
        return "Borrowed by " + borrowedBy;
    }
}