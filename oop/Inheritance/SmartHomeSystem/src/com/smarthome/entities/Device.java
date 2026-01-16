package com.smarthome.entities;

public class Device {
    private String name;
    private Boolean isOn;


    public Device(String name, Boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public void turnOn(){}
}
