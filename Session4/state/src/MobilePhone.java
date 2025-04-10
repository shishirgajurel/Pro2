public interface MobilePhone {

    public void receiveCall(Phone phoneState);
    public void receiveText(Phone phoneState);
    public void turnVolumeUp(Phone phoneState);
    public void turnVolumeDown(Phone phoneState);
    public void toggleVibration(Phone phoneState);
    public void state(Phone phoneState);
}
