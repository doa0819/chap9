package com.ohgiraffers.project01;

public class Person {
    public static int temperature = 26;

    public static int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        Person.temperature = temperature;
    }

    public int getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(int bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int bodyTemp = 36;

}
