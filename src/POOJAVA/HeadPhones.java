package POOJAVA;

public class HeadPhones {
    String charge = "Micro usb";
    String[] controls = {"power", "volume", "skip", "play", "pause"};
    String color = "Red/Black";
    
    Boolean power = false;
    int volume = 0;

    public void powerOn(){
        power = true;
    }

    public void powerOff(){
        power = false;
    }

    public void volumeUp(){
        volume++;
    }

    public void volumeDown(){
        volume--;
    }

    
}
