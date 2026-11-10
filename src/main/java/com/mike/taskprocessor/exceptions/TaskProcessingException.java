package com.mike.taskprocessor.exceptions;

public class TaskProcessingException extends Exception {

    public TaskProcessingException(String message) {
        super(message);
    }

    public TaskProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}