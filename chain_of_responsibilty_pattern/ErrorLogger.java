package org.design_pattern.chain_of_responsibilty_pattern;

public class ErrorLogger extends Logger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.err.println("[Error] " + message);
    }
}