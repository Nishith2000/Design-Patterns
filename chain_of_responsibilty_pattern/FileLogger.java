package org.design_pattern.chain_of_responsibilty_pattern;

public class FileLogger extends Logger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("[File] " + message); // simulate file write
    }
}
