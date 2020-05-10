package me.study.template;

public abstract class Car {
    protected abstract void move1();
    protected abstract void move2();

    public void move() {
        move1();
        move2();
    }
}
