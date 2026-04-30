public class Light {
    private boolean isOn;
    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }
    public boolean getIsOn(){
        return isOn;
    }
     void turnOn(){
         isOn = true;


    }
    void turnOff(){
         isOn = false;

    }
    public String toString(){
        return "The Light is " + getIsOn();
    }

}
