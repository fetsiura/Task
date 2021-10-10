package com.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Print {


   public static void showOptions(String [] options) {

       System.out.println(Colors.BLUE_BOLD);
       System.out.println("Please select an options"+Colors.RESET);

       for (String val : options){
            System.out.println(val);
        }
    }

    public static void printTasks(String [][] tasks){
       for(int i =0; i<tasks.length;i++){

           for (int j =0; j<tasks[i].length;j++){
               System.out.println(tasks[i][j]);
           }
       }
    }


}
