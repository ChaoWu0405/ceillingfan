package com.company;

public class Controller {
    private CeilingFan ceilingFan;
    private View view;
    //constructor
    public Controller(CeilingFan ceilingFan, View view){
        this.ceilingFan = ceilingFan;
        this.view = view;
    }
    //getters from CeilingFan
    public int getCurrentSpeed(){
        return ceilingFan.getCurrentSpeed();
    }
    public boolean getDirection(){
        return ceilingFan.getDirection();
    }
    //setters from CeilingFan
    public void setCurrentSpeed(int speed){
        ceilingFan.setCurrentSpeed(speed);
    }
    public void setDirection(boolean direction){
        ceilingFan.setDirection(direction);
    }

    //display menu from View
    public void menu(){
        view.outputMenu();
    }

    //check option
    public void optionCheck(){
        int option;
        while(true) {
            option = view.inputInteger("Enter option number: ");
            if (option == 1) {
                ceilingFan.pullCordIncrease();
                ceilingFan.report();
            }
            else if (option == 2) {
                ceilingFan.pullCordReverse();
                ceilingFan.report();
            }
            else if (option == 3){
                break;
            }
            else {
                System.out.println("Invalid option number.");
                continue;
            }
        }
    }



}
