package model;

public interface VinylState {
    void reserve(Vinyl vinyl, String user);
    void borrow(Vinyl vinyl, String user);
    void returnVinyl(Vinyl vinyl);
    void remove(Vinyl vinyl);
}