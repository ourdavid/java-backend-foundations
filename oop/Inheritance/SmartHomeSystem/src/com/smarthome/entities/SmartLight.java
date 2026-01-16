package com.smarthome.entities;

public final class SmartLight extends Device{
    int brightness;

    public SmartLight(String name, Boolean isOn, int brightness) {
        super(name, isOn);
        this.brightness = brightness;
    }
    public int getBrightness(){
        return brightness;
    }

    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    @Override
    public void turnOn(){
        this.brightness = 100;
    }

    @Override
    public String toString() {
        return "SmartLight{" +
                "brightness=" + brightness +
                '}';
    }
}
