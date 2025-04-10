public class RunMobilePhoneExample{

    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.turnVolumeDown();
     //   phone.toggleVibration();
        phone.turnVolumeUp();
        phone.turnVolumeUp();
        phone.receiveCall();
        phone.receiveText();

    }

}
