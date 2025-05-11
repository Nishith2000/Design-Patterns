package org.design_pattern.singleton_pattern;

public enum ThreadPool {
    INSTANCE;

    public void operation() {
        System.out.println("Enum Singleton");
    }
}
