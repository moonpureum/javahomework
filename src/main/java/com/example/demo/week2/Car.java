package com.example.demo.week2;

public class Car {

    String color;
    String gearType;
    int door;  //문짝 개수

    Car(){}  //기본 생성자

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;

    }
}