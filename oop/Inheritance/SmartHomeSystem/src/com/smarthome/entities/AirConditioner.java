package com.smarthome.entities;

public final class AirConditioner extends Device{
    private double temperature;

    public AirConditioner(String name, Boolean isOn, double temperature){
        super(name,isOn);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        this.temperature = 22.0;
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "temperature=" + temperature +
                '}';
    }
}
