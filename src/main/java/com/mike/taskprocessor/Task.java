package com.mike.taskprocessor;

import com.mike.taskprocessor.exceptions.InvalidTaskException;

import java.util.UUID;

public class Task {

    // Instance variables
    private final String id;
    private final String title;
    private final String description;

    // Constructor
    public Task(String title, String description)
            throws InvalidTaskException {

        if (title == null || title.isBlank()) {
            throw new InvalidTaskException(
                    "Task title cannot be empty."
            );
        }

        if (description == null || description.isBlank()) {
            throw new InvalidTaskException(
                    "Task description cannot be empty."
            );
        }

        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    // Display task information
    @Override
    public String toString() {
        return "Task {" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}