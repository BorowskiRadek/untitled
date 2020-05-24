package com.company;

public class RoadData {
    private int number;
    private int distance;
    private int fuel;

    public RoadData(int number, int distance, int fuel) {

        if (number > 0){
            this.number = number;
        }

        if (distance > 0) {
            this.distance = distance;
        }

        if (fuel > 0) {
            this.fuel = fuel;
        }


    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel(){
        return fuel;
    }


}
