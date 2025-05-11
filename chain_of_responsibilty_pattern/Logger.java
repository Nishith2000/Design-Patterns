package org.design_pattern.chain_of_responsibilty_pattern;

public abstract class Logger {
    public static final int INFO  = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;
    protected Logger nextLogger;

    public Logger(int level) {
        this.level = level;
    }

    // Set the next handler in the chain
    public void setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // The template method: handle here or pass along
    public void logMessage(int severity, String message) {
        if (this.level <= severity) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(severity, message);
        }
    }

    // Concrete handlers implement this to do actual work
    protected abstract void write(String message);
}

