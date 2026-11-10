package com.mike.taskprocessor;

import com.mike.taskprocessor.exceptions.TaskProcessingException;

public class TaskProcessor {

    public void process(Task task) throws TaskProcessingException {

        if (task == null) {
            throw new TaskProcessingException(
                    "Cannot process a null task."
            );
        }

        try {

            System.out.println(
                    "Processing task: " + task.getTitle()
            );

            // Simulate processing time
            Thread.sleep(2000);

            System.out.println(
                    "Successfully completed: " + task.getTitle()
            );

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

            throw new TaskProcessingException(
                    "Task processing was interrupted.",
                    e
            );
        }
    }
}