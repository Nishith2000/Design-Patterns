package org.design_pattern.chain_of_responsibilty_pattern;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("[Console] " + message);
    }
}