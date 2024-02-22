package com.ohgiraffers.project01;

public class Main {
    public static void main(String[] args) {
        Aircon controller1 = new Aircon();
        Aircon controller2 = new Aircon();

        controller1.getInfo();
        controller1.getTemp();

        controller2.getInfo();
        controller2.getTemp();
        System.out.println("================");


        controller1.setBattery(80);
        controller1.setTemp(50);



        controller1.getInfo();
        controller1.getTemp();

        controller2.getInfo();
        controller2.getTemp();


    }
}
