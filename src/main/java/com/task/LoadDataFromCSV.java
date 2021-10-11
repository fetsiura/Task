package com.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.task.TaskManager.tasks;

public class LoadDataFromCSV {

    public static String [][] load(String str){
        Path path = Paths.get(str);
        if(!Files.exists(path)){
            System.out.println("file not exists");
            System.exit(0);
        }

        List<String> list = null;

        try {
            list = Files.readAllLines(path);

            tasks = new String[list.size()][list.get(0).split(",").length];

            for(int i=0;i<list.size();i++){

                String [] splitLines = list.get(i).split(",");

                for (int j=0;j<splitLines.length;j++){
                    tasks[i][j] = splitLines[j];
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        return tasks;
    }
}
