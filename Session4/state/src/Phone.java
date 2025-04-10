public class Phone implements MobilePhone {

    private int volume = 0;
    private boolean vibration = false;
private PhoneState phoneState = new PhoneState();


    public void setPhoneState(PhoneState newphoneState) {
        this.phoneState = newphoneState;
    }

    public void state(){
        phoneState.handelPhoneState(this);
    }

    @Override
    public void receiveCall(Phone phoneState) {

    }

    @Override
    public void receiveText(Phone phoneState) {

    }

    @Override
    public void turnVolumeUp(Phone phoneState) {

    }

    @Override
    public void turnVolumeDown(Phone phoneState) {

    }

    @Override
    public void toggleVibration(Phone phoneState) {

    }

    @Override
    public void state(Phone phoneState) {

    }
}
