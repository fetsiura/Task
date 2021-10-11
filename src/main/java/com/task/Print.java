package com.task;


import static com.task.TaskManager.options;
import static com.task.TaskManager.tasks;

public class Print {


   public static void showOptions() {

       System.out.println(Colors.BLUE_BOLD);
       System.out.println("Please select an options"+Colors.RESET);

       for (String val : options){
            System.out.println(val);
        }
    }

    public static void printTasks(){
       int counter =1;
       for(int i =0; i<tasks.length;i++){
           System.out.print(counter+": ");
           for (int j =0; j<tasks[i].length;j++){
               System.out.print(tasks[i][j] + " ");
           }
           counter++;
           System.out.println();
       }

    }


}
