package com.task;

import java.util.Scanner;

public class TaskManager {
    static final String FILE = "tasks.csv";
    static String [] options = {"add", "remove", "list", "exit"};
    static String [][] tasks;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Print.showOptions(options);

        while (scanner.hasNextLine()){

            String input = scanner.nextLine();

            switch (input){
                case "exit":

                    break;
                case "add":

                    break;
                case "remove":

                    break;
                case "list":

                    break;
                default:
                    System.out.println("Select a correct option");
            }
            Print.showOptions(options);
        }


    }
}
