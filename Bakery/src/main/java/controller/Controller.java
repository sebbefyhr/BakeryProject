package controller;

import java.util.Scanner;

public class Controller {

    public static void printMessage(String message){
        System.out.println(message + "\t");
    }

    public static String readString() {
        Scanner scan = new Scanner(System.in);
        String string = "";
        string = scan.nextLine();
        return string;
    }
}
