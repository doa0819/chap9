package com.ohgiraffers.project01;

public class Aircon {
    public int temp = 35;
    public void setTemp(int temp) {
        this.temp = temp;
    }


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    int battery = 100;


    public void getInfo() {
        System.out.println("battery= " + battery +
                "%");
    }

    public void getTemp() {
        System.out.println(temp);
    }
}
