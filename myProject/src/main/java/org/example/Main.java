package org.example;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        int num = 1;

        while (num == 1) {

            String line;
            Scanner in = new Scanner(System.in);
            System.out.print("Type something: ");
            line = in.nextLine();
            System.out.println("You said: " + line);
            System.out.print("Type something else: ");
            line = in.nextLine();
            System.out.println("You also said: " + line);
        }







    }







}