package Rephlits;

public class TV {

    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined";


    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel){

        this.volumeLevel=volumeLevel;

        /*if (on=true){
            if (volumeLevel>=1&&volumeLevel<=7) {
                this.volumeLevel=volumeLevel;
            }
        }

         */
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        this.channel=channel;
        if (on=true) {
            if (channel <= 0 && channel >= 120) {
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            }
        }
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void volumeUp(){
        if (on==true){
            volumeLevel++;
        }
        else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }
    public void volumeDown(){
        if (on==true){
            volumeLevel--;
        }
        else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void isOn(){
        if (on==true){
            System.out.println("TV is already ON");
        }

    }
    public void turnOn(){
        if (on==true){
            System.out.println("TV is already ON");
        }
        else {on=true;
        }
    }

    public void turnOff(){
        if (on!=true){
            System.out.println( "TV is already OFF");
        }
        else {
        on=false;}
    }







}
