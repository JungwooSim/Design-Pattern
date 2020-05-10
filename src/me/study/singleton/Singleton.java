package me.study.singleton;

public class Singleton {
    private Singleton(){}

    private static class InnerInstanceCreate {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return InnerInstanceCreate.instance;
    }

}
