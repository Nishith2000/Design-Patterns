package org.design_pattern.chain_of_responsibilty_pattern;

public class Client {

    public static Logger getLoggerChain() {
        Logger errorLogger   = new ErrorLogger(Logger.ERROR);
        Logger fileLogger    = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        // Setup chain: ERROR → DEBUG → INFO
        errorLogger.setNext(fileLogger);
        fileLogger.setNext(consoleLogger);

        return errorLogger;  // head of the chain
    }

    public static void main(String[] args) {
        Logger loggerChain = getLoggerChain();

        System.out.println("Sending an INFO message:");
        loggerChain.logMessage(Logger.INFO,  "This is an informational message.");

        System.out.println("\nSending a DEBUG message:");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug-level message.");

        System.out.println("\nSending an ERROR message:");
        loggerChain.logMessage(Logger.ERROR, "This is an error message.");
    }
}
