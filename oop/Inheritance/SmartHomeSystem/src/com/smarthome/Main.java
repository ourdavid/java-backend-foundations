package com.smarthome;

import com.smarthome.entities.AirConditioner;
import com.smarthome.entities.Device;
import com.smarthome.entities.SmartLight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Device> devices = new ArrayList<>();

        devices.add(new SmartLight("Light",true,100));
        devices.add(new AirConditioner("AC",true,22.0));



        energySavingMode(devices);




    }public static void energySavingMode(List<Device> devices){
        for(Device device : devices){
            if(device instanceof SmartLight){
                SmartLight smartLight = (SmartLight) device;
                System.out.println(smartLight);
                smartLight.setBrightness(10);
                System.out.println(smartLight);            }

            if(device instanceof AirConditioner){
                AirConditioner airConditioner = (AirConditioner) device;
                System.out.println(airConditioner);
                airConditioner.setTemperature(26);
                System.out.println(airConditioner);

            }

        }
    }
}
