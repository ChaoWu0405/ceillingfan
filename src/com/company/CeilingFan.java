package com.company;

import java.util.HashMap;

public class CeilingFan {
    int currentSpeed;
    boolean direction;
    //constant speed list
    final int[] SPEED_LIST= {0,1,2,3};

    final int MAX_SPEED = 3;
    //default constructor
    public CeilingFan(){
        currentSpeed=0;
        direction=true;
    }
    //overload constructor
    public CeilingFan(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    //getters
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public boolean getDirection(){
        return direction;
    }

    //setters
    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    public void setDirection(boolean direction){
        this.direction = direction;
    }
    //pull cord one: increase speed
    public void pullCordIncrease(){
        //if speed is set to a value that is smaller than 0 or bigger than 3
        //then speed will reset to 0
        if(currentSpeed > MAX_SPEED || currentSpeed < 0){
            System.out.println("Invalid speed");
            currentSpeed=0;
            System.out.println("speed resetting to 0...");
        }
        //if current speed is the biggest speed in the list
        // then turn off by setting speed to the start of the list which is 0
        else if(currentSpeed == SPEED_LIST[SPEED_LIST.length-1]){
            currentSpeed = SPEED_LIST[0];
        }
        else{
            //increase speed by 1
            currentSpeed = SPEED_LIST[currentSpeed+1];
        }
    }
    // pull cord two: reverse direction
    public void pullCordReverse(){
        direction = !direction;
    }

    public void report(){
        String d;
        if(direction){
            d = "CW";
        }
        else{
            d= "CCW";
        }
        if(currentSpeed ==0){
            String off = "off";
            System.out.println("current speed: "+off);
            System.out.println("direction: "+ d);
        }
        else{
            System.out.println("current speed: "+currentSpeed);
            System.out.println("direction: "+ d);
        }
    }

}
