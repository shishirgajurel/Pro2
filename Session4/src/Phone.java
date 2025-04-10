public class Phone implements MobilePhone{


    private int volume =0;
    private boolean vibration = false;

    public void receiveCall(){





        if(volume>0){
            System.out.println("Ring Ring Ring Ring Ring");

            if(!vibration){
                System.out.println("brr brr brr");
            }

        } else if (volume==0) {

            System.out.println("Blink Blink Blink");

            if (vibration) {
                System.out.println("brr brr brr");
            }
        }
    }

    public  void receiveText(){
        if(volume>0){
            System.out.println("Pling");
            if(!vibration){
                System.out.println("brr brr brr");
            }
        } else if (volume==0) {
            System.out.println("Blink");
            if (vibration) {
                System.out.println("brr brr brr");
            }
        }
    }

    public void turnVolumeUp(){
        volume++;
    }

    public void turnVolumeDown(){
        volume--;

    }

    public void toggleVibration(){
        vibration = true;
    }

}
