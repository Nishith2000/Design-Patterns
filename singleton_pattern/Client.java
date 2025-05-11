package org.design_pattern.singleton_pattern;

public class Client {

    public static void main(String[] args) {
        // Single Threaded Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.print();

        // Enum Singleton
        ThreadPool.INSTANCE.operation();

        // Synchronized Singleton
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        synchronizedSingleton.print();
    }
}
