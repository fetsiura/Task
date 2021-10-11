package com.task;

import java.util.Scanner;


public class TaskManager {
    static final String FILE = "tasks.csv";
    static String [] options = {"add","edit", "remove", "list", "exit"};
    static String [][] tasks;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tasks = LoadDataFromCSV.load(FILE);
        System.out.println(Colors.PURPLE);
        System.out.println("Hello =)");
        System.out.println("What should I call you?");
        String name = scanner.nextLine();
        System.out.println("Hello "+name+" =)");
        System.out.println("I am a program that will help you not forget about your important things");
        System.out.println(Colors.RESET);

        Print.showOptions();

        while (scanner.hasNextLine()){

            String input = scanner.nextLine();

            switch (input){
                case "exit":
                    Task.saveTasks(FILE);
                    System.out.println(Colors.BLUE_BOLD);
                    System.out.println("Bye, bye "+name);
                    System.exit(0);
                    break;
                case "add":
                    Task.addTask();
                    break;
                case "remove":
                    Task.removeTask(tasks, Task.numberToDelete());
                    break;
                case "list":
                    Print.printTasks();
                    break;
                case "edit":
                    Task.edit(tasks,Task.numberToEdit());
                    break;
                default:
                    System.out.println("Select a correct option");
            }
            Print.showOptions();
        }

    }
}
