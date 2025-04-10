package model;

import java.util.Observable;

public class Vinyl extends Observable {
    private String title;
    private String artist;
    private int year;
    private VinylState state;

    public Vinyl(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.state = new AvailableState();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public VinylState getState() {
        return state;
    }

    public void setState(VinylState state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }

    public void reserve(String user) {
        state.reserve(this, user);
    }

    public void borrow(String user) {
        state.borrow(this, user);
    }

    public void returnVinyl() {
        state.returnVinyl(this);
    }

    public void remove() {
        state.remove(this);
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + year + ") - " + state.toString();
    }
}