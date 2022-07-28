package com.company;

public class Main {

    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan();
        View view = new View();
	    Controller controller = new Controller(ceilingFan,view);
	    //menu
        controller.menu();
        //check option
        controller.optionCheck();
    }
}
