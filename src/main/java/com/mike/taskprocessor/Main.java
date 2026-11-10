package com.mike.taskprocessor;

import com.mike.taskprocessor.exceptions.InvalidTaskException;
import com.mike.taskprocessor.exceptions.TaskProcessingException;

public class Main {

    public static void main(String[] args) {

        System.out.println("SMART TASK PROCESSOR");
        System.out.println("====================");

        TaskProcessor processor = new TaskProcessor();

        try {

            Task task = new Task(
                    "Generate student report",
                    "Calculate and summarize student examination results"
            );

            processor.process(task);

        } catch (InvalidTaskException | TaskProcessingException e) {

            System.out.println("ERROR: " + e.getMessage());

        }

        System.out.println("Application execution completed.");
    }
}