package com.mike.taskprocessor;

import com.mike.taskprocessor.exceptions.InvalidTaskException;

public class Main {

    public static void main(String[] args) {

        System.out.println("SMART TASK PROCESSOR");
        System.out.println("====================");

        // Example 1: Creating a valid task
        try {

            Task task = new Task(
                    "Study Java",
                    "Understand exception handling and OOP"
            );

            System.out.println("\nTask created successfully:");
            System.out.println(task);

        } catch (InvalidTaskException e) {

            System.out.println("Task creation failed: " + e.getMessage());

        } finally {

            System.out.println("Task creation attempt completed.");
        }

        // Example 2: Creating an invalid task
        try {

            Task invalidTask = new Task(
                    "",
                    "This task has no title"
            );

            System.out.println(invalidTask);

        } catch (InvalidTaskException e) {

            System.out.println("\nInvalid task detected!");
            System.out.println("Reason: " + e.getMessage());

        } finally {

            System.out.println("Validation attempt completed.");
        }
    }
}