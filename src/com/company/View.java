package com.company;

import java.util.Scanner;

public class View {
    private Scanner keyboard = new Scanner(System.in);

    public void outputMenu(){
        System.out.println("This is a Ceiling fan Program.\nThis fan has speed (0,1,2,3)");
        System.out.println("1. pull cord one to increase speed");
        System.out.println("2. pull cord two to reverse the direction of the fan");
        System.out.println("3. quit ");

    }
    public int inputInteger(String message){
        System.out.println(message);
        int value = keyboard.nextInt();
        keyboard.nextLine();
        return value;
    }
}
