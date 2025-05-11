package org.design_pattern.singleton_pattern;

public class SynchronizedSingleton {

    private static volatile SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {}

    public static SynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SynchronizedSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void print() {
        System.out.println("Synchronized Singleton");
    }

}
