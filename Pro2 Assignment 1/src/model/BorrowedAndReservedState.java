package model;

public class BorrowedAndReservedState implements VinylState {
    private String borrowedBy;
    private String reservedBy;

    public BorrowedAndReservedState(String borrowedBy, String reservedBy) {
        this.borrowedBy = borrowedBy;
        this.reservedBy = reservedBy;
    }

    @Override
    public void reserve(Vinyl vinyl, String user) {
        // Already reserved
    }

    @Override
    public void borrow(Vinyl vinyl, String user) {
        // Already borrowed
    }

    @Override
    public void returnVinyl(Vinyl vinyl) {
        vinyl.setState(new ReservedState(reservedBy));
    }

    @Override
    public void remove(Vinyl vinyl) {
        vinyl.setState(new MarkedForRemovalState());
    }

    @Override
    public String toString() {
        return "Borrowed by " + borrowedBy + " and Reserved by " + reservedBy;
    }
}